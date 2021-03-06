# The Gamma Statechart Composition Framework
*Version 2.1.0*

The Gamma Statechart Composition Framework is a toolset to model, verify and generate code for component-based reactive systems. The framework builds on Yakindu, an open source statechart modeling tool and provides an additional modeling layer to instatiate a communicating network of statecharts. Compositionality is hierarchical, which facilitates the creation of reusable component libraries. Individual statecharts, as well as composite statechart networks can be validated and verified by an automated translation to UPPAAL, a model checker for timed automata. Once a complete model is built, designers can use the code generation functionality of the framework, which can generate Java code for the whole system.

Check http://gamma.inf.mit.bme.hu for more resources about Gamma. A good starting point is our [tool paper](https://inf.mit.bme.hu/sites/default/files/publications/icse18.pdf), [slides](https://www.slideshare.net/VinMol/icse2018-the-gamma-statechart-composition-framework-design-verification-and-code-generation-for-componentbased-reactive-systems) and [demo video](https://youtu.be/ng7lKd1wlDo) presented at [ICSE 2018](https://www.icse2018.org/event/icse-2018-demonstrations-the-gamma-statechart-composition-framework-design-verification-and-code-generation-for-component-based-reactive-systems).

To cite Gamma, please cite the following paper.

```
@inproceedings{DBLP:conf/icse/MolnarGVMV18,
  author    = {Vince Moln{\'{a}}r and
               Bence Graics and
               Andr{\'{a}}s V{\"{o}}r{\"{o}}s and
               Istv{\'{a}}n Majzik and
               D{\'{a}}niel Varr{\'{o}}},
  title     = {The Gamma statechart composition framework: design, verification
               and code generation for component-based reactive systems},
  booktitle = {Proceedings of the 40th International Conference on Software Engineering:
               Companion Proceeedings, {ICSE} 2018, Gothenburg, Sweden, May 27 -
               June 03, 2018},
  pages     = {113--116},
  year      = {2018},
  doi       = {10.1145/3183440.3183489}
}
```

## Using Gamma

### Dependencies

##### Recommended Eclipse version and bundle:
* Eclipse Photon 1, Eclipse IDE for Java and DSL Developers bundle.

##### 3rd-party Eclipse components (should be installed separately):
* Xtext 2.15.0 (https://www.eclipse.org/Xtext/, included in Eclipse bundle),
* VIATRA 2.1.0 (https://www.eclipse.org/viatra/),
* Yakindu Statechart Tools 3.5.2 (https://www.itemis.com/en/yakindu/state-machine/).

##### 3rd-party tools used by Gamma (should be installed separately):
* UPPAAL (Uppsala and Aalborg Universities, http://www.uppaal.org/).

### Installation

* Have an Eclipse instance with EMF and Xtext and Java 1.8.
* Install VIATRA 2.1.0 and the Yakindu Statechart Tools 3.5.2.
* Exit Eclipse and extract the Gamma zip file into the root folder of Eclipse (this will create the plugins directory in the dropins folder, containing the JAR file of the Gamma).
* When starting Eclipse for the first time, you might need to start it with the -clean flag.
* Check if the plugin installed successfully in Help > About Eclipse and by clicking Installation Details. On the Plug-ins tab, sort the entries by Plugin-in Id and look for entries starting with hu.bme.mit.gamma. 
* For formal verification, download and extract UPPAAL. In order to let Gamma find the UPPAAL executables, add the bin-Win32 or bin-Linux folder to the path environment variable (depending on the operating system being used).

### Tutorials

The tutorials for the framework can be found in the following [folder](https://github.com/FTSRG/gamma/blob/master/tutorial).

## Contact

Contact us by sending an e-mail to `gamma [at] mit.bme.hu`.
 
## Acknowledgement

Supporters of the Gamma project:

* [MTA-BME Lendület Cyber-Physical Systems Research Group](http://lendulet.inf.mit.bme.hu/),
* [Fault Tolerant Systems Research Group](https://inf.mit.bme.hu/en), [Department of Measurement and Information Systems](https://www.mit.bme.hu/eng/), [Budapest University of Technology and Economics](http://www.bme.hu/?language=en),
* [Új Nemzeti Kiválóság Program 2017-2018](http://www.kormany.hu/hu/emberi-eroforrasok-miniszteriuma/oktatasert-felelos-allamtitkarsag/hirek/az-uj-nemzeti-kivalosag-program-2017-2018-tanevi-palyazati-kiirasai),
* [Emberi Erőforrás Fejlesztési Operatív Program (EFOP)](http://www.eit.bme.hu/news/20170927-palyazati-felhivas-szakmai-osztondij?language=en) (EFOP-3.6.2-16-2017-00013).

Special thanks to: 

* András Vörös,
* Oszkár Semeráth,
* Kristóf Marussy,
* Ákos Hajdu,
* Dániel Varró,
* István Ráth,
* Zoltán Micskei,
* István Majzik,
* IncQuery Labs Ltd.
