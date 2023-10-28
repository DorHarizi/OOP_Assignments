# from Ex1_Calls import Calls as c
# from Ex1_Building import Building as b
from Ex1_Elevator import Elevator as e
# import Ex1_function as f

def allocate(building, calls):

    arr_elevators = building.list_elevators
    arr_calls = calls
    index_calls: 5000.55
    if len(building.list_elevators) == 1:
        for i in range(len(arr_calls)):
            arr_calls[i].index_elev = 0
    else:
        for j in range(len(arr_calls)):
            arr_time_way = []
            for i in range(len(arr_elevators)):
                if arr_elevators[i].min_floor <= arr_calls[j].src and arr_calls[j].dest <= arr_elevators[i].max_floor:
                    min_time_way = e.min_way(arr_elevators[i], arr_calls[j].src, arr_calls[j].dest)
                    arr_time_way.insert(i, min_time_way)
            min_elevator = min(arr_time_way)
            min_index = (arr_time_way.index(min_elevator)) % len(arr_elevators)
            arr_calls[j].index_elev = min_index
    return arr_calls

