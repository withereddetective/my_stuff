class bathroom:
    def __init__(self, urinal_count, stall_count, sink_count):
        self.urinal_count = urinal_count
        self.stall_count = stall_count
        self.sink_count = sink_count

    def sink_on(self):
        print(f"The {self.sink_count} sinks are now on")
    
    def sink_off(self):
        print(f"The {self.sink_count} sinks are now off")

men_bathroom = bathroom(5, 3, 4)
women_bathroom = bathroom(0, 6, 6)

men_bathroom.sink_on()
men_bathroom.sink_off()
print(f"the mens bathroom has {men_bathroom.urinal_count} urinals, {men_bathroom.stall_count} stalls and {men_bathroom.sink_count} sinks.")

women_bathroom.sink_on()
women_bathroom.sink_off()
print(f"the womens bathroom has {women_bathroom.urinal_count} urinals, {women_bathroom.stall_count} stalls and {women_bathroom.sink_count} sinks.")