# main.py

import sys
from PyQt5.QtWidgets import QApplication
from nqueens_algorithm import genetic_algorithm , hill_climbing, simulated_annealing, local_beam_search
from nqueens_ui import NQueensUI

def main():
    app = QApplication(sys.argv)

    algorithms = {
        'Hill Climbing': hill_climbing,
        'Simulated Annealing': simulated_annealing,
        'Local Beam Search': local_beam_search,
        'Genetic' : genetic_algorithm 
    }

    ex = NQueensUI(algorithms)
    ex.show()
    sys.exit(app.exec_())

if __name__ == '__main__':
    main()
