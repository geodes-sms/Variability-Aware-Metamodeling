# Replication Package – MetaVOLE

This repository contains the artifacts required to replicate the results presented in the paper:

> **MetaVOLE: Variability-Oriented Engineering of DSML Families**

The package includes feature models, ATL transformations, generated metamodels, evaluation results, and supporting utilities.

---

## Structure

The root directory contains the following folders:

### 1. `ATLProject/`
Contains the ATL transformations implementing the MetaVOLE workflow, including:
* FM → UMM transformations

---

### 2. `Feature Models/`
Contains the Feature Models (FMs) and configurations (CFM) used in the case studies:
* ReLiS
* VCSFeatures
* LEV4REC

Each FM represents the variability space from which configurations (CFMs) can be selected.

### 3. `Metamodels/`
Contains:
- Generated UMMs, PMMs, RMMs, and FMMs

Contains the following subfolders:
* FeatureIDE - Contains the project used to define the Feature IDE metamodel
* Lev4rec - contains the Lev4rec metamodel created with the traditional approach
* Relis - contains the Relis metamodel created with the traditional approach
* VCSFeatures - contains the VCSFeatures metamodel created with the traditional approach
* VOLE- Contains the case studies using our principle
    * subfolders per case study
        * inside these subfolders, the .ecore files for the UMM, PMM, RMM, and FMM can be found inside the ```models``` folder. Notice that the default .ecore file for the project is the FMM, with other files being a copy of the previous versions (UMM, PMM, and RMM)

---

### 4. `EvaluationResults/`
Contains:
- Metrics collected during evaluation for RQ2

---

### 5. `Utils/`
Contains supporting tools used in the evaluation:
* Check the README file inside this folder for details

These utilities are not required to understand the approach but are necessary to reproduce the evaluation results.


## Requirements

* Eclipse Modeling Framework (EMF)
* ATL (Atlas Transformation Language)
* Java 11+ (recommended) for the utility tools
* EMFCompare (optional, for artifact differencing and merging)
