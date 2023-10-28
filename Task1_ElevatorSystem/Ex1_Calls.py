class Calls:
    def __init__(self, name: str, time_call: float, src: int, dest: int, ignore_1: int, index_elev: int) -> None:
        self.name = name
        self.time_call = time_call
        self.src = src
        self.dest = dest
        self.ignore_1 = ignore_1
        self.index_elev = index_elev

    def __str__(self) -> str:
        return f"name:{self.name}\n time_call:{self.time_call}\n src:{self.src}\n dest:{self.dest}\n" \
               f"ignore_1:{self.ignore_1}\n index_elev:{self.index_elev} \n\n"

    def __repr__(self) -> str:
        return f"name:{self.name}\n time_call:{self.time_call}\n src:{self.src}\n dest:{self.dest}\n" \
               f"ignore_1:{self.ignore_1}\n index_elev:{self.index_elev} \n\n"