# Developer Guide

## Acknowledgements

The **Architecture Diagram** below gives a high-level design overview of GitSwole.

<img src="diagrams/ArchitectureDiagram.png" width="450" />

Given below is a quick overview of the main components and how they interact with each other.

#### Main components of the architecture

**`GitSwole`** (the class `GitSwole.java`) is in charge of app launch and shut down:
- At app launch, it calls `setupLogger()`, instantiates `Ui` and `Storage`, loads persisted workout data into a `WorkoutList`, then enters the main command loop via `run()`.
- At shut down (when `Command.isExit()` returns `true`), the loop exits cleanly and the application terminates.

The bulk of the app's work is done by the following four components:
- [**`UI`**](#ui-component): The UI of the App — reads user input and displays all output.
- [**`Parser`**](#parser-component): The command interpreter — translates raw user input strings into executable `Command` objects.
- [**`Command`**](#command-component): The command executor — each subclass encapsulates the logic for one specific operation.
- [**`Storage`**](#storage-component): Reads data from, and writes data to, the hard disk.

**`Assets`** represents the in-memory data model, consisting of `WorkoutList`, `Workout`, and `Exercise`. **`Commons`** contains shared utility classes (e.g., `GitSwoleException`) used across all components.

#### How the architecture components interact with each other

The *Sequence Diagram* below shows how the components interact with each other for the scenario where the user issues the command `add w/Push Day`.

<img src="diagrams/ArchitectureSequenceDiagram.png" width="574" />

Each of the four main components:
- defines its API through a well-scoped class boundary.
- implements its functionality using a concrete class that can be substituted or tested independently.

## Design & implementation

{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}


## Product scope
### Target user profile

{Describe the target user profile}

### Value proposition

{Describe the value proposition: what problem does it solve?}

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|new user|see usage instructions|refer to them when I forget how to use the application|
|v2.0|user|find a to-do item by name|locate a to-do without having to go through the entire list|

## Non-Functional Requirements

{Give non-functional requirements}

## Glossary

* *glossary item* - Definition

## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing}
