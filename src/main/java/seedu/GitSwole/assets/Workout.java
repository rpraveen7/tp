package seedu.GitSwole.assets;

import java.util.ArrayList;

public class Workout {
	private ArrayList<Exercise> exerciseList;
	private String workoutName;

	private volatile int numOfWorkouts;

	public Workout(String workoutName) {
		this.exerciseList = new ArrayList<>();
		setWorkoutName(workoutName);
		numOfWorkouts = 0;
	}

	public void addExercise(Exercise exercise) {
		(this.exerciseList).add(exercise);
		numOfWorkouts++;
	}

	public ArrayList<Exercise> getExerciseList() {
		return exerciseList;
	}

	public String getWorkoutName() {
		return workoutName;
	}

	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}

	public int getNumOfWorkouts() {
		return numOfWorkouts;
	}
}
