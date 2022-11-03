package org.example;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        this.members = new LinkedHashSet<>();
    }

    @Override
    public void service() {
        members.forEach( e -> {
            e.service();
        });
    }

    @Override
    public double getPrice() {
        Double allPrice = 0.0;
        for (HealthcareServiceable healthcareWorker : members){
            allPrice += healthcareWorker.getPrice();
        }

        return allPrice;
    }

    public void addMember(HealthcareWorker healthcareWorker){
       members.add(healthcareWorker);
    }

    public void addMember(HealthcareWorkerTeam healthcareWorkerTeam){
        members.addAll(healthcareWorkerTeam.members);
    }

    public void removeMember(HealthcareWorker healthcareWorker){
        members.remove(healthcareWorker);
    }
}
