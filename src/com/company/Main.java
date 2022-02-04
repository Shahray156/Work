package com.company;

import static com.company.Employee.getId;

public class Main {

    //книга сотрудников

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            System.out.println(employees[i].toString());
        }
    }

    // Вывод Ф.И.О сотрудников

     public static void printName(Employee[] name) {
         for (int i = 0; i < name.length - 1; i++) {
             System.out.println(name[i].getName() + "" + name[i].getName1() + "" + name[i].getName2());
         }
    }

    // Сумма затрат на зарплаты

    private static float sumExpenses(Employee[] salary) {
        float sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[0].getSalary();
            System.out.println("Сумма трат на зарплаты " + sum);
        }
        return sum;
    }


    //Среднее значение зарплат
    private static float averageExpenses(Employee[] salary) {
        float average = 0;
        if(salary.length > 0) {
            float sum = 0;
            for (int j = 0; j < salary.length; j++) {
                sum += salary[0].getSalary();
            }
            average = sum / salary.length;
        }
        System.out.println(average);
        return average;
    }

    // Минимальная зарплата
            public static float salaryMin (Employee[] minSalary) {
              float min = minSalary[0].getSalary();
              for (int i = 0; i < minSalary.length; i++) {
                  if (minSalary[0].getSalary() < min) {
                     min = minSalary[0].getSalary;
               }
               }
              System.out.println(min);
                 return min;
             }

// максимальная зарплата

    public static float salaryMax (Employee[] maxSalary) {
        float max = maxSalary[1].getSalary();
        for (int i = 0; i < maxSalary.length; i++) {
            if (maxSalary[1].getSalary() < max) {
                max = maxSalary[1].getSalary;
            }
        }
        System.out.println(max);
        return max;
    }

            public static void main (String[]args){


                Employee[] employees = new Employee[11];
                addEmployee(employees, new Employee("Петров", "Иван", "Федорович", 35000, 1, getId()));
                addEmployee(employees, new Employee("Федоров", "Иннокентий", "Константинович", 50000, 2, getId()));
                addEmployee(employees, new Employee("Облак", "Александр", "Рудольфович", 38000, 1, getId()));
                addEmployee(employees, new Employee("Василевский", "Петр", "Алексеевич", 45000, 2, getId()));
                addEmployee(employees, new Employee("Чащина", "Светлана", "Александровна", 49020, 3, getId()));
                addEmployee(employees, new Employee("Кан", "Ольга", "Владимировна", 43000, 3, getId()));
                addEmployee(employees, new Employee("Солнцев", "Виктор", "Иммануилович", 34000, 4, getId()));
                addEmployee(employees, new Employee("Гусева", "Лаванда", "Ивановна", 34000, 4, getId()));
                addEmployee(employees, new Employee("Салугин", "Юрий", "Гавриилович", 46000, 5, getId()));
                addEmployee(employees, new Employee("Шейкина", "Василиса", "Артемовна", 45000, 5, getId()));

                  printEmployees(employees);
               printName(employees);
                sumExpenses(employees);
                salaryMin(employees);
                salaryMax(employees);
                averageExpenses(employees);
            }
        }
