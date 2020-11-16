package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private double baseSalary;
	private WorkerLevel level;
	
	private Departamento departamento;
	private List<HourContract> contratos = new ArrayList<HourContract>();
	
	public Worker() {
	}

	public Worker(String name, double baseSalary, WorkerLevel level, Departamento departamento) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContratos() {
		return contratos;
	}

	public void setContratos(List<HourContract> contratos) {
		this.contratos = contratos;
	}
	
	public void addContrato(HourContract contrato){
		contratos.add(contrato);
	}
	
	public void removeContrato(HourContract contrato)
	{
		contratos.remove(contrato);
	}
	
	
	
}
