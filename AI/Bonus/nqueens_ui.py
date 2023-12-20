import sys
from PyQt5.QtWidgets import QMainWindow, QPushButton, QVBoxLayout, QWidget, QLabel, QLineEdit
from PyQt5.QtGui import QPainter, QColor, QPixmap  # Import QPixmap here
from PyQt5.QtCore import Qt
from PyQt5.QtWidgets import QComboBox
from PyQt5.QtGui import QPolygon
from PyQt5.QtCore import QPoint
import math 

class NQueensUI(QMainWindow):
    def __init__(self, algorithms):
        super().__init__()
        self.algorithms = algorithms  # Dictionary of algorithms
        self.initUI()
    
    def initUI(self):
        self.setWindowTitle('N-Queens Problem Solver')
        self.setGeometry(100, 100, 800, 600)

        # Main widget
        self.central_widget = QWidget()
        self.setCentralWidget(self.central_widget)
        self.layout = QVBoxLayout()
        self.central_widget.setLayout(self.layout)

        # Input for number of queens
        self.n_input = QLineEdit(self)
        self.n_input.setPlaceholderText('Enter number of queens')
        self.layout.addWidget(self.n_input)

        # Dropdown for algorithm selection
        self.algorithm_selection = QComboBox(self)
        self.algorithm_selection.addItems(self.algorithms.keys())
        self.layout.addWidget(self.algorithm_selection)

        # Solve button
        self.solve_button = QPushButton('Solve', self)
        self.solve_button.clicked.connect(self.solve)
        self.layout.addWidget(self.solve_button)

        # Chessboard display
        self.chessboard = QLabel(self)
        self.layout.addWidget(self.chessboard)

    def solve(self):
        n = int(self.n_input.text())
        selected_algorithm = self.algorithm_selection.currentText()
        solution = self.algorithms[selected_algorithm](n)
        self.draw_board(solution)

    def draw_board(self, solution):
        if solution is None:
            self.chessboard.setText("No solution found.")
            return

        size = 50  # Size of each square
        board_size = len(solution) * size
        pixmap = QPixmap(board_size, board_size)
        painter = QPainter(pixmap)

        for row in range(len(solution)):
            for col in range(len(solution)):
                if (row + col) % 2 == 0:
                    painter.setBrush(QColor(224, 224, 224))  # Light square
                else:
                    painter.setBrush(QColor(0, 204, 0))  # Dark square
                painter.drawRect(col * size, row * size, size, size)

                # Draw stars for queens
                if solution[col] == row:
                    star = self.create_star(QPoint(col * size + size // 2, row * size + size // 2), size // 2)
                    painter.setBrush(Qt.black)
                    painter.drawPolygon(star)

        painter.end()
        self.chessboard.setPixmap(pixmap)

    def create_star(self, center, radius):
        star = QPolygon()
        angle = math.pi / 5
        for i in range(10):
            r = radius if i % 2 == 0 else radius / 2.5
            x = center.x() + r * math.cos(angle * i)
            y = center.y() + r * math.sin(angle * i)
            star.append(QPoint(int(x), int(y)))
        return star
# def main():
#     app = QApplication(sys.argv)
#     ex = NQueensUI()
#     ex.show()
#     sys.exit(app.exec_())

# if __name__ == '__main__':
#     main()
