package academy.devdojo.maratonajava.exerciciosdeclasse;

import java.util.Scanner;

public class trabalhador {
        private String name;
        private int age;
        private float salaryOne;
        private float salaryTwo;
        private float salaryTree;


                public void criarTrabalhador(trabalhador x){
                        System.out.println("Digite o nome do trabalhador: ");
                        Scanner inpname = new Scanner(System.in);
                        x.name = inpname.nextLine();
                        System.out.println("Digite a idade do trabalhador: ");
                        Scanner inpage = new Scanner(System.in);
                        x.age = inpage.nextInt();
                        System.out.println("Digite o salario do trabalhador (entrar com 3 salarios): ");
                        Scanner inpsalary = new Scanner(System.in);
                        x.salaryOne = inpsalary.nextFloat();
                        Scanner inpsalary2 = new Scanner(System.in);
                        x.salaryTwo = inpsalary2.nextFloat();
                        Scanner inpsalary3 = new Scanner(System.in);
                        x.salaryTree = inpsalary2.nextFloat();
                }

                public void imprimir(trabalhador x){
                        System.out.println("Nome: "+ x.name);
                        System.out.println("Idade: " + x.age);
                        System.out.println("Salarios em suas respectivas ordens: "+ x.salaryOne+" "+x.salaryTwo+" "+x.salaryTree);
                }

                public  void mediaSalario(trabalhador x){
                        float soma = (x.salaryOne+x.salaryTwo+ x.salaryTree)/3;
                        System.out.println("A media dos salarios e: "+soma);
                }




        public float getSalaryOne() {
                return salaryOne;
        }

        public float getSalaryTwo() {
                return salaryTwo;
        }

        public float getSalaryTree() {
                return salaryTree;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setSalaryOne(float salaryOne) {
                this.salaryOne = salaryOne;
        }

        public void setSalaryTwo(float salaryTwo) {
                this.salaryTwo = salaryTwo;
        }

        public void setSalaryTree(float salaryTree) {
                this.salaryTree = salaryTree;
        }
}

