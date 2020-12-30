/*
 * Copyright 2009-2020 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;

    public int id;
    public String name;
    public String company;
    public Country country;
    public LocalDate date;
    public CustomerStatus status;
    public int activity;
    public Representative representative;

    public Customer() {
    }

    public Customer(int id, String name, String company, Country country, LocalDate date, CustomerStatus status, int activity, Representative representative) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.country = country;
        this.date = date;
        this.status = status;
        this.activity = activity;
        this.representative = representative;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                activity == customer.activity &&
                Objects.equals(name, customer.name) &&
                Objects.equals(company, customer.company) &&
                Objects.equals(country, customer.country) &&
                Objects.equals(date, customer.date) &&
                status == customer.status &&
                Objects.equals(representative, customer.representative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, country, date, status, activity, representative);
    }
}
