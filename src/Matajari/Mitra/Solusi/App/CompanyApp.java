package Matajari.Mitra.Solusi.App;

import Data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Faza Lanang Djati");

        Company.Employee employee = company.new Employee();
        employee.setName("Faza");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Matajari Mitra Solusi");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Matajari");

        System.out.println(employee2.getName());
        System.out.println(employee2.getName());
    }
}
