package seedu.GitSwole.assets;

public class Exercise {
	private String exerciseName;
	private int weight;
	private int sets;
	private int reps;

	private volatile int numOfExercises;

	public void Excercise(String exerciseName, int weight, int sets, int reps) {
		setExerciseName(exerciseName);
		setWeight(weight);
		setSets(sets);
		setReps(reps);
		this.numOfExercises = 0;
	}

	public void printExercise() {
		String exerciseString = String.format("%-20s | %-6s | %-4s | %-4s",
												getExerciseName(),
												getWeight(),
												getSets(),
												getReps());
		System.out.println(exerciseString);
	}


	public int getNumOfExercises() {
		return numOfExercises;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}
}
