package com.demo.sfgpetclinic.services.map;

import com.demo.sfgpetclinic.model.Visit;
import com.demo.sfgpetclinic.services.VisitServices;

import java.util.Set;

public class VisitMapServicesImp extends AbstractMapServices<Visit, Long> implements VisitServices {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit t) {
        super.delete(t);
    }

    @Override
    public Visit save(Visit t) {
        if (t.getPet() == null || t.getPet().getOwner() == null || t.getPet().getId() == null || t.getPet().getOwner().getId() == null ) {
            throw new RuntimeException("Invalid Visit");
        }


        return super.save(t);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
