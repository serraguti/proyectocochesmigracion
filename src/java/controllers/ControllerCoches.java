package controllers;

import java.util.List;
import models.Coches;
import repositories.RepositoryCoches;

public class ControllerCoches {

    RepositoryCoches repo;

    public ControllerCoches() {
        this.repo = new RepositoryCoches();
    }

    public String getTablaCoches() {
        List<Coches> coches = this.repo.getCoches();
        String html = "";
        for (Coches car : coches) {
            html += "<tr>";
            html += "<td>" + car.getMarca() + " " + car.getModelo() + "</td>";
            html += "<td>" + car.getConductor() + "</td>";
            html += "<td>";
            html += "<img src='" + car.getImagen() + "' style='width:200px;height:200px'/>";
            html += "<td>";
            html += "</tr>";
        }
        return html;
    }
}
