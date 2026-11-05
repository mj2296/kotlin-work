# Task 12.1: Point class

from math import hypot


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return hypot(self.x, self.y)

    def distance_to(self, p):
        return hypot(p.x - self.x, p.y - self.y)
