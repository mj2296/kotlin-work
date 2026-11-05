# Task 12.1: program that uses a Point object

from point import Point


def main():
    p = Point(3.0, 4.0)
    print(f"x = {p.x}, y = {p.y}")
    print(f"Distance from origin: {p.distance()}")

    q = Point(4.5, 7.0)
    print(f"Distance from (4.5, 7.0): {p.distance_to(q)}")


if __name__ == "__main__":
    main()
