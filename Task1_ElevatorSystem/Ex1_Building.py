from Ex1_Elevator import Elevator
import json


class Building:
    #  building structure
    def __init__(self) -> None:
        self.max_floor = 0
        self.min_floor = 0
        self.list_elevators = []

    # adding an elevator to a building
    # def add(self, elevator: Elevator):
    #     self.list_elevators.append(elevator)

    # creating a json file
    # def save_to_json(self, file_name):
    #     try:
    #         with open(file_name, "w") as f:
    #             json.dump(self, indent=4, fp=f, default=lambda a: a.__dict__)
    #     except IOError as e:
    #         print(e)

    #loading a json file
    def load_json(self, file_name):
        try:
            with open(file_name, "r") as f:
                new_elevators = {}
                my_dict = json.load(f)
                self.max_floor = my_dict["_maxFloor"]
                self.min_floor = my_dict["_minFloor"]
                self.list_elevators = my_dict["_elevators"]
                for v in self.list_elevators:
                    elevator = Elevator(id=v["_id"], speed=v["_speed"], min_floor=v["_minFloor"],
                                        max_floor=v["_maxFloor"], close_time=v["_closeTime"],
                                        open_time=v["_openTime"], start_time=v["_startTime"],
                                        stop_time=v["_stopTime"])
                    new_elevators[elevator.id] = elevator
                self.list_elevators = new_elevators
        except IOError as e:
            print(e)

    def __str__(self) -> str:
        return f"minFloor: {self.min_floor}\n maxFloor: {self.max_floor}\n{self.list_elevators}"

    # get the i elevator of the building
    def get_elevator(self, i):
        return self.list_elevators[i]

    # @classmethod
    # def building(cls):
    #     pass

