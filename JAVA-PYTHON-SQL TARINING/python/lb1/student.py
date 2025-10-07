class Student:
    def __init__(self):
        self.__student_id = 0
        self.__student_name = ""
        self.__city = ""
        self.__marks1 = 0
        self.__marks2 = 0
        self.__marks3 = 0
        self.__fee_per_month = 0.0
        self.__is_eligible_for_scholarship = False

    # Setters
    def set_student_id(self, student_id): self.__student_id = student_id
    def set_student_name(self, name): self.__student_name = name
    def set_city(self, city): self.__city = city
    def set_marks1(self, m): self.__marks1 = m
    def set_marks2(self, m): self.__marks2 = m
    def set_marks3(self, m): self.__marks3 = m
    def set_fee_per_month(self, fee): self.__fee_per_month = fee
    def set_is_eligible_for_scholarship(self, status): self.__is_eligible_for_scholarship = status

    # Getters
    def get_student_id(self): return self.__student_id
    def get_student_name(self): return self.__student_name
    def get_city(self): return self.__city
    def get_marks1(self): return self.__marks1
    def get_marks2(self): return self.__marks2
    def get_marks3(self): return self.__marks3
    def get_fee_per_month(self): return self.__fee_per_month
    def get_is_eligible_for_scholarship(self): return self.__is_eligible_for_scholarship

    def get_annual_fee(self):
        return self.__fee_per_month * 12

    def get_total_marks(self):
        return self.__marks1 + self.__marks2 + self.__marks3

    def get_average(self):
        return self.get_total_marks() / 3

    def get_result(self):
        return "pass" if all(m > 60 for m in [self.__marks1, self.__marks2, self.__marks3]) else "fail"

# Creating and testing 3 students
s1 = Student()
s1.set_student_name("Alice")
s1.set_marks1(80)
s1.set_marks2(90)
s1.set_marks3(85)
s1.set_fee_per_month(1000)
s1.set_is_eligible_for_scholarship(True)

s2 = Student()
s2.set_student_name("Bob")
s2.set_marks1(70)
s2.set_marks2(75)
s2.set_marks3(65)
s2.set_fee_per_month(900)
s2.set_is_eligible_for_scholarship(False)

s3 = Student()
s3.set_student_name("Charlie")
s3.set_marks1(60)
s3.set_marks2(55)
s3.set_marks3(70)
s3.set_fee_per_month(800)
s3.set_is_eligible_for_scholarship(True)

students = [s1, s2, s3]

# Student with highest total marks
top_student = max(students, key=lambda s: s.get_total_marks())
print("\nStudent with highest total marks:", top_student.get_student_name())

# Student with lowest monthly fee
lowest_fee_student = min(students, key=lambda s: s.get_fee_per_month())
print("Student with lowest fee:", lowest_fee_student.get_student_name(), "-", lowest_fee_student.get_fee_per_month())

# Print all student details
for s in students:
    print(f"\nName: {s.get_student_name()}")
    print("Total Marks:", s.get_total_marks())
    print("Average:", round(s.get_average(), 2))
    print("Result:", s.get_result())
    print("Scholarship Eligible:", s.get_is_eligible_for_scholarship())
