package es.minetsii.MiningCrates.chests;

import es.minetsii.MiningCrates.MiningCrates;

public class Chest {
	private String name;
	private Double probability;
	private Boolean isConsole;
	private String command;

	public Chest(String name, Double probability, Boolean isConsole, String command) {
		// Nombre;Probabilidad;esConsola;comando
		// Cofre1;15.0;true;eco give %p% 5000
		// Cofre2;5.0;false;fly
		this.name = name;
		this.probability = probability;
		this.isConsole = isConsole;
		this.command = command;
	}

	public String getName() {
		return name;
	}

	public Double getProbability() {
		return probability;
	}

	public Boolean getIsConsole() {
		return isConsole;
	}

	public String getCommand() {
		return command;
	}
	
	public void setProbability(Double probability){
		this.probability = probability;
	}
	
	public Double getProbChest(){
		Double ret = 0.0;
		for(Chest chest : MiningCrates.chestList.keySet()){
			ret += chest.getProbability();
		}
		ret = this.getProbability() * 100 / ret;
		return ret;
	}
}
