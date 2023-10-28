import csv
import sys
import os
import json
from Ex1_Elevator import Elevator
from Ex1_Calls import Calls as c
from Ex1_allocate import allocate as a
from Ex1_Building import Building



if __name__ == '__main__':

    print(os.getcwd())
    building_str = sys.argv[1]
    calls_str = sys.argv[2]
    out_str = sys.argv[3]

    building = Building()
    building.load_json(building_str)

    calls = []
    index = 0

    with open(calls_str) as file:
        csv_reader = csv.reader(file)

        for row in csv_reader:
            call = c(name=str(row[0]), time_call=float(row[1]), src=int(row[2]), dest=int(row[3]), ignore_1=int(row[4]),
                       index_elev=int(row[5]))
            calls.insert(index, call)
            index += 1

    new_calls = a(building, calls)
    new_list = []
    for i in new_calls:
        new_list.append(i.__dict__.values())
    #until this point we export the data from the csv file and from this point we import the new data to the csv file
    filename = out_str
    with open(filename, 'w', newline="") as file:
        csv_writer = csv.writer(file)
        csv_writer.writerows(new_list)



