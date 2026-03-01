<h1>Automated Waste Management System
Background</h1>

Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.

<h2>Objective </h2>

Develop an automated waste management system that uses the Chain of Responsibility design pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.

<h2>Requirements</h2>

1. Waste Container

Create a class to represent waste containers.

Each container should have:

A specific capacity.

A type of waste (e.g., organic, recyclable, hazardous).

2. Waste Collection Chain

Implement a Chain of Responsibility pattern to handle different types of waste containers.

Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.

3. Waste Collection Process

Initialize a chain of waste collectors, each responsible for a different type of waste.

When a waste container is full or needs disposal, trigger the waste collection process.

The appropriate waste collector in the chain should handle disposal based on the container’s type and capacity.

4. Validation

Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.

<h1>UML DIAGRAM</h1>

<img src="">
