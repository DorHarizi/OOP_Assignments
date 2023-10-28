from Ex1_Elevator import Elevator
from Ex1_Building import Building
from  Ex1_Calls import Calls

# The expected time the elevator will travel from floor_a to floor_b
def time_from_a_to_b(elevator, destFloor, src_floor):
    df = abs(src_floor - destFloor)
    up = elevator._closeTime + elevator._startTime + df
    down = elevator._speed + elevator._stopTime + elevator._openTime
    return up / down


# from the lowest elevator to the fastest
def max_speed(elevators):
    elevators_speed = []
    for i in range(len(elevators)):
        elevators_t = (i, elevators[i]["_speed"])
        elevators_speed.append(elevators_t)
    elevators_speed.sort(key=lambda x: x[1])
    return elevators_speed

def elevator_can_be_dest(elevator, destFloor):
    if elevator.min_floor > destFloor or elevator.max_floor < destFloor:
        return False

def elevator_can_be_src(elevator, SrcFloor):
    if elevator.min_floor > SrcFloor or elevator.max_floor < SrcFloor:
        return False


def time_of_finished_task(elevator, destFloor, srcFloor, time_call):
    time = time_from_a_to_b(elevator, destFloor, srcFloor)
    return time_call + time