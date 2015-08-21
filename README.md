# architect-challenge
A challenge for architects that want to join our team. In order to be considered for an architect position, you must complete the following architect challenge.

## Challenge Overview

1. Fork the [architect-challenge](https://github.com/cablelabs/architect-challenge) repository.

2. Clone your fork:

    ````
    git clone https://github.com/<your-name>/architect-challenge.git
    ````

3. Complete the architect chellenge described below (please see [Architect Task](#architect-task), [Deliverables](#deliverables), [Guidelines](#guidelines), and [On Complete](#on-complete) sections). Be sure to `git commit` your work as you go (see [Guidelines](#guidelines))

4. `git push` your design and code to your forked repository on GitHub.

5. Send us a [pull request](https://github.com/cablelabs/architect-challenge/compare). We will review your design and code and get back to you.

## Architect Task

### 1. Analysis and Information Model in UML

Use the sample datasets provided in [input](input) to design an information model for a Lit Building List. The information model should be designed using a UML class diagram and only needs to care for the the entities and their attributes and relationships collectively represented in the sample datasets.

Document any imporant thoughts or notes from your analysis and information model design in [design/design.md](design/design.md). Yous documentation should include:

1. A list of entites you have identified from the sample datasets.
2. A view of the UML class diagram you've created.
3. Anything else you think is important for undersanding your information model design.

Your documentation should be clean, clear, and should look really ncie. You may want to read up on [GitHub Flavored Markdown](https://help.github.com/articles/github-flavored-markdown/) to accomplish this. 

> You may use any modeling tool you want for creating the UML class diagram. If you would like, you can use one of our floaitng licenses for [Visual Paradigm](http://www.visual-paradigm.com/). Here's how to get started:
> 
> 1. Download and install [Visual Paradign **12.0**](http://www.visual-paradigm.com/download/archive/)
> 2. Select Perpetual License, then select Floating License.
> 3. Enter Host: opsframework.services.cablelabs.com
> 4. Enter Port: 1999
> 5. Enter Access code: 1234

### 2. Data Model in JSON Schema

Create a data model using [JSON Schema](http://json-schema.org/) that is based on your information model design. You are writing code here, so use whatever editor or IDE you feel most comfortable in. The data model you create could be in a single `.json` file, multiple `.json` files that reference eachother, or fully included in the Swagger file you will be creating next.

You may include additional data model notes in [design/design.md](design/design.md), but it is not required.

### 3. RESTful API design in Swagger

Design a RESTful API using [Swagger](http://swagger.io/) that will allow basic `CRUD` operations to be performed on the Lit Build List you have designed.

Your API design should be contained in a single Swagger file. The file should be called `swagger-file.json' and should be included in the [api-docs](api-docs) directory. You may either reference the JSON Schema(s) you perviously designed or include them directly in the Swagger file.

Again, use whatever editor or IDE you feel most comfortable in.

## Deliverables

1. The project that has your complete solution.

3. Design notes and any additional documentation for your analysis and design in [design/design.md](design/design.md)

2. Information model design as a UML class diagram in the [design](design) directory (png or pdf file).

4. API design as a single Swagger file in the [api-docs](api-docs) directory. Your Swagger file should either included or reference your data model design in JSON Schema.

## Bonus

Mock a single `GET` operation on a single endpoint for the API you have designed. You may use any language(s) of your choice.

Please deliver your solution to a new `src` directory and provide detailed instructions on how to run and tryout your program in a `README.md` file within the new `src` direcotry. 

> NOTE: completing this bonus is not a requirement, but it will get you serious cred with the developers on our team.

## Guidelines

1. Your solution should be self explanatory.

2. Everything you deliver should be clean, clear, and should look really ncie.

3. **Make frequent commits to Git (local repo).**

4. While the solution you provide matters, how you arrive at it (commits, deisgn style, coding style, etc.) is also very important.

## On Complete

1. `git commit` and `git push` your design and code to your forked repository on GitHub.

2. Send us a [pull request](https://github.com/cablelabs/architect-challenge/compare). We will review your design and code and get back to you.

Happy architecting!

PS - If you're having trouble with Git, please reference the [Pro Git book](http://git-scm.com/)
