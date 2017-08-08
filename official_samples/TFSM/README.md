# Presentation
A timed Finite state machine is a language to specify the system behaviour where actions are divided into inputs and outputs. Time constraints limit the time at which an output has to be produced after an input has been applied. After this, the time variable is reset to zero. Moreover, a state can have a time invariant called time-out. If the time-out expires and no input is applied the system should change its state according to the specification. A special discrete clock variable is used in order to represent a timed behaviour.

## Installation

This language can be installed by importing the projects of this git repository in a GEMOC Studio. The language projects must be imported in the first workspace (language wokbench), then launch a new Eclipse instance from the first (ie. as a modeling workbench where the language is deployed) and then import the sample models. (see [GEMOC documentation](http://gemoc.github.io/gemoc-studio/publish/guide/html_single/Guide.html#deploy-languages-chapter) for more details about the language deployment process)

Alternatively, this language is part of the basic example of GEMOC and is directly available in the GEMOC Studio. Simply, go to _File > New > Example..._ and use the wizards to install the TFSM projects in the language workbench and modeling workbench. 

# Language Designer documentation ![GEMOC Language Logo](http://gemoc.github.io/gemoc-studio/publish/guide/html_single/images/icons/IconeGemocLanguage_16.png)

## Organization of the code
Main eclipse plugins:
- _org.gemoc.sample.tfsm.concurrent_ contains the definition of the language using the Melange language.
- _org.gemoc.sample.tfsm.concurrent.model_ contains the metamodel of TFSM, using the Ecore language.
- _org.gemoc.sample.tfsm.concurrent.k3dsa_ contains the Domain Specific Action of the operational semantics of TFSM (ie. the atomic actions of the interpreter), using the Kermeta3 language.
- _org.gemoc.sample.tfsm.concurrent.moc.dse_ contains the Domain Specific Event of the operational semantics of TFSM (ie. the observable events of the interpreter), using the Kermeta3 language.
- _org.gemoc.sample.tfsm.concurrent.xtfsm_ contains the language runtime generated by Melange, ie. a new Ecore model that contains both static elements (from org.gemoc.sample.tfsm.concurrent.model) and dynamic features (from org.gemoc.sample.tfsm.concurrent.k3dsa), along with a copy of the semantics that is compatible with this new Ecore model. In this example, once this project has been generated, it is systematically used in place of org.gemoc.sample.tfsm.concurrent.model or org.gemoc.sample.tfsm.concurrent.k3dsa.
- _org.gemoc.sample.tfsm.concurrent.xtfsm.design_ contains the graphical concrete syntax of TFSM, using Sirius. It defines several layers, the default layer is an editor, the other layers are used by the debug/animation.
- _org.gemoc.sample.tfsm.concurrent.xtfsm.edit_ contains EMF edition support. It is used to customize the various views in Sirius and in the simulator (for example by providing custom icons in the various views)


# Model Designer documentation ![GEMOC Model Logo](http://gemoc.github.io/gemoc-studio/publish/guide/html_single/images/icons/IconeGemocModel_16.png)

The projects in modeling workbench contains some sample models.

you can run them from the modeling workbench by creating a launch configuration and usig the GEMOC Concurrent Engine.
(see model details about launching the concurrent engine in [GEMOC Documentation](http://gemoc.github.io/gemoc-studio/publish/guide/html_single/Guide.html#_executing_model_with_the_indexterm_primary_concurrent_engine_primary_indexterm_concurrent_engine)).

# Additionnal resources and related links
Please note that some of the document listed here may describe an early implementation of the language and may slightly differ from the current version.

- https://hal.inria.fr/hal-00850770
- http://gemoc.org/sle13/