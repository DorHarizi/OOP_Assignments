import numpy as np

class Elevator:

    # elevator structure
    def __init__(self, id: int, speed: float, min_floor, max_floor: int, close_time: float, open_time: float,
                 start_time: float, stop_time: float) -> None:
        self.id = id
        self.speed = speed
        self.min_floor = min_floor
        self.max_floor = max_floor
        self.close_time = close_time
        self.open_time = open_time
        self.start_time = start_time
        self.stop_time = stop_time

        # matrix of route time for each elevator path
        length = max_floor + abs(min_floor) + 2
        self.arr = np.zeros((length, length))
        self.fill_mat()

    # elevator's matrix
    def get_mat(self):
        return self.arr

    # The expected time the elevator will travel from floor_a to floor_b
    def calc(self, src, dest):
        if dest == src:
            return 0
        else:
            number_of_floors = abs(src - dest)
            average = number_of_floors / self.speed
            return self.close_time + self.start_time + average + self.stop_time + self.open_time

    # fill elevator's mat
    def fill_mat(self):
        for i in range(len(self.arr)):
            for j in range(i, len(self.arr[0])):
                self.arr[i][j] = self.calc(i, j)

    def __str__(self) -> str:
        return f"id:{self.id} speed:{self.speed} min_floor:{self.min_floor} max_floor:{self.max_floor}"\
               f"close_time:{self.close_time}"\
               f"open_time:{self.open_time} start_time:{self.start_time} stop_time:{self.stop_time}"


    def __repr__(self) -> str:
        return f"id:{self.id} speed:{self.speed} min_floor:{self.min_floor} max_floor:{self.max_floor}"\
               f"close_time:{self.close_time}"\
               f"open_time:{self.open_time} start_time:{self.start_time} stop_time:{self.stop_time}"

    def min_way(self, x, y):
        src = abs(x)
        dest = abs(y)
        if x < y:
            return self.arr[dest][src]
        else:
            return self.arr[src][dest]
