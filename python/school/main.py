import math

print("welcome to the grade calculator")
course_name = input("what is the course name?")

minute = int(input("what was you weekly average time spent?"))
hr = minute//60
mi = minute%60

homework_num = int(input("how many homework grades are there?"))
homework_list = []
for i in range(homework_num):
    homework_list.append(int(input("give me one of the grades: ")))
    homework_avg = (sum(homework_list)/len(homework_list))
    
quiz_num = int(input("how many quiz grades are there?"))
quiz_list = []
for i in range(quiz_num):
    quiz_list.append(float(input("give me one of the grades: ")))
    quiz_avg = (sum(quiz_list)/len(quiz_list))

test_num = float(input("what was your final exam grade?"))

final_grade = ((homework_avg * 0.35) + (quiz_avg * 0.15) + (test_num * 0.5))
final_grade = round(final_grade)

print("course name: " + course_name)
print("weekly time spent: " + str(hr) + "hrs " + str(mi) + "min")
print("homework average: " + str(homework_avg))
print("quiz average: " + str(quiz_avg))
print("final exame: " + str(test_num))
print("final grade average: " + str(final_grade))