# FeatureOrientedMetamodelingPackage
This repository contains all the information for the research paper realized by M.Sc. Hanz Schepens and Prof. Eugene Syriani.

All the metamodels, feature models, model transformations and examples are included in this repository. 

The feature models were realized with FeatureIDE (version v3.11.1): https://featureide.github.io/
The metamodels were realized with the Eclipse IDE (Version: 2024-09 (4.33.0), Build id: 20240905-0614): https://eclipseide.org/

We made 2 files for our model-to-model transformation, one is for the basic rule set with the possibility to enable the optional rule 6 a) and the second one for the enumeration rule 2 a). We did two separate files because of how they vary in their matched rules. They cannot be concurrent within the same file, otherwise they would overlap and the engine would not know which rule to pick. Perhaps with other transformation engines this would not be a problem.