import math
import random

def hill_climbing(n, max_attempts=100):
    def is_conflict(board):
        """
        Check if there's a conflict between queens on the board.
        """
        for i in range(n):
            for j in range(i + 1, n):
                if board[i] == board[j] or \
                   board[i] - board[j] == i - j or \
                   board[j] - board[i] == i - j:
                    return True
        return False

    def get_conflicts(board):
        """
        Returns the number of conflicts for each queen.
        """
        conflicts = [0] * n
        for i in range(n):
            for j in range(n):
                if i != j:
                    if board[i] == board[j] or \
                       board[i] - board[j] == i - j or \
                       board[j] - board[i] == i - j:
                        conflicts[i] += 1
        return conflicts

    attempts = 0
    while attempts < max_attempts:
        board = [random.randint(0, n - 1) for _ in range(n)]

        while is_conflict(board):
            conflicts = get_conflicts(board)

            # Find the queen with the most conflicts
            max_conflicts = max(conflicts)
            conflict_queens = [i for i in range(n) if conflicts[i] == max_conflicts]
            if not conflict_queens:
                break  # Break if no queens have conflicts

            queen = random.choice(conflict_queens)

            # Move this queen to the position where it has the least conflicts
            min_conflicts = n
            best_positions = []
            for row in range(n):
                board[queen] = row
                num_conflicts = sum(get_conflicts(board))
                if num_conflicts == min_conflicts:
                    best_positions.append(row)
                elif num_conflicts < min_conflicts:
                    min_conflicts = num_conflicts
                    best_positions = [row]

            if not best_positions:
                break  # Break if no better position is found

            board[queen] = random.choice(best_positions)

        if not is_conflict(board):
            return board  # Return solution if found

        attempts += 1

    return None  # Return None if no solution found after max_attempts

def simulated_annealing(n, initial_temperature=10.0, cooling_rate=0.95, stop_temperature=0.01, max_restarts=10):
    def get_conflicts(board):
        conflicts = 0
        for i in range(n):
            for j in range(i + 1, n):
                if board[i] == board[j] or \
                   board[i] - board[j] == i - j or \
                   board[j] - board[i] == i - j:
                    conflicts += 1
        return conflicts

    def get_neighbor(board):
        new_board = list(board)
        row = random.randint(0, n - 1)
        new_pos = random.randint(0, n - 1)
        new_board[row] = new_pos
        return new_board

    restarts = 0
    best_board = None
    best_conflicts = float('inf')

    while restarts < max_restarts:
        current_board = [random.randint(0, n - 1) for _ in range(n)]
        current_conflicts = get_conflicts(current_board)
        temperature = initial_temperature

        while temperature > stop_temperature:
            neighbor_board = get_neighbor(current_board)
            neighbor_conflicts = get_conflicts(neighbor_board)
            delta = neighbor_conflicts - current_conflicts

            if delta < 0 or random.uniform(0, 1) < math.exp(-delta / temperature):
                current_board = neighbor_board
                current_conflicts = neighbor_conflicts

            if current_conflicts < best_conflicts:
                best_board = current_board
                best_conflicts = current_conflicts

            temperature *= cooling_rate

            if best_conflicts == 0:
                return best_board

        restarts += 1

    return best_board if best_conflicts == 0 else None


def local_beam_search(n, k=3, max_iterations=1000):
    def get_conflicts(board):
        conflicts = 0
        for i in range(n):
            for j in range(i + 1, n):
                if board[i] == board[j] or \
                   board[i] - board[j] == i - j or \
                   board[j] - board[i] == i - j:
                    conflicts += 1
        return conflicts

    def get_successors(state):
        successors = []
        for i in range(n):
            for j in range(n):
                if state[i] != j:
                    successor = list(state)
                    successor[i] = j
                    successors.append(successor)
        return successors

    def get_k_best_states(states, k):
        states.sort(key=lambda state: get_conflicts(state))
        return states[:k]

    # Initialize k random states
    states = [[random.randint(0, n - 1) for _ in range(n)] for _ in range(k)]

    for _ in range(max_iterations):
        all_successors = []
        for state in states:
            all_successors.extend(get_successors(state))

        states = get_k_best_states(all_successors, k)
        current_best = states[0]
        if get_conflicts(current_best) == 0:
            return current_best

    return None

import random

def genetic_algorithm(n, population_size=100, generations=1000, mutation_rate=0.1):
    def create_random_board():
        return [random.randint(0, n - 1) for _ in range(n)]

    def compute_fitness(board):
        non_attacking = 0
        for i in range(n):
            for j in range(i + 1, n):
                if board[i] != board[j] and \
                   board[i] - board[j] != i - j and \
                   board[j] - board[i] != i - j:
                    non_attacking += 1
        return non_attacking

    def crossover(parent1, parent2):
        crossover_index = random.randint(1, n - 1)
        child = parent1[:crossover_index] + parent2[crossover_index:]
        return child

    def mutate(board):
        mutation_index = random.randint(0, n - 1)
        board[mutation_index] = random.randint(0, n - 1)
        return board

    # Create initial population
    population = [create_random_board() for _ in range(population_size)]

    for generation in range(generations):
        population.sort(key=compute_fitness, reverse=True)
        
        # If a solution is found
        if compute_fitness(population[0]) == n * (n - 1) / 2:
            return population[0]

        new_population = population[:2]  # Elitism: carry the best 2 solutions to the new population

        while len(new_population) < population_size:
            parents = random.sample(population[:50], 2)  # Select parents from the top 50
            child = crossover(parents[0], parents[1])

            if random.random() < mutation_rate:
                child = mutate(child)

            new_population.append(child)

        population = new_population

    return None

# Example usage
# solution = genetic_algorithm(8)
# print("Solution found:", solution)


# # Example usage
# solution = local_beam_search(8, k=3)
# print("Solution found:", solution)