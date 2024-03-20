package cppf.employe.repository;

import java.util.List;

public interface Repository<R> {
     void insert(R emp);
    List<R>  selectAll();
}
