# PARKING-LOT-MANAGEMENT-SYSTEM-USING-OOP-CONCEPT-OF-COMPOSITION-MID-PREP




**Classes and Their Functionalities:**

**1. Vehicle Class:**

**Attributes:**

1) String licensePlate – The vehicle's license plate number.
2) String ownerName – The name of the vehicle's owner.
3) String type – The type of the vehicle (e.g., Car, Bike, Truck).
4) boolean isParked – A flag to indicate whether the vehicle is currently parked.

**Methods:**

1. Constructor to initialize the vehicle's details.
2. Getter and setter methods for all attributes.
3. parkVehicle() method to change the isParked status to true.
4. removeVehicle() method to change the isParked status to false.

  
**2.  ParkingSlot Class:**

**Attributes:**

1) int slotId – Unique ID for each parking slot.
2) boolean isOccupied – A flag to indicate whether the parking slot is occupied.
3) Vehicle parkedVehicle – The vehicle currently parked in this slot (if any).

**Methods:**

1. Constructor to initialize the parking slot ID.
2. assignVehicle(Vehicle vehicle) method to park a vehicle in the slot.
3. removeVehicle() method to remove the vehicle from the slot and free it up.
4. displaySlotDetails() to display the slot's status (occupied or free).

  
**3. ParkingLot Class:**

**Attributes:**

1) ArrayList<ParkingSlot> slots – A collection of all parking slots in the parking lot.
2) ArrayList<Vehicle> vehicles – A collection of all vehicles in the parking lot.
3) int totalSlots – Total number of slots in the parking lot.

**Methods:**

1. Constructor to initialize the parking lot with a given number of slots.
2. addVehicle(Vehicle vehicle) method to add a vehicle to the parking lot (find an available slot and park the vehicle).
3. removeVehicle(String licensePlate) method to remove a vehicle from the parking lot (find the vehicle by license plate and free the slot).
4. displayAvailableSlots() method to display the list of available parking slots.
5. findMostParkedSlot() method to find and display the parking slot that has been used the most.
