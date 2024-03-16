package org.example.Repository;

import org.example.Model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExpensableRepository extends JpaRepository<Expenses, Long> {

}
