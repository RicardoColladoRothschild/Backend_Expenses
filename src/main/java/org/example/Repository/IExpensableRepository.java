package org.example.Repository;

        import org.example.Model.Expenses;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface IExpensableRepository extends JpaRepository<Expenses, Long> {

}
