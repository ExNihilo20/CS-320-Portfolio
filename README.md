# CS-320-Portfolio
This is a portfolio for the work completed in SNHU CS-320 Software Test Automation
# Contact Service

## Project Overview

The Contact Service project provides a set of functionalities to manage a user's contact information. Files facilitate a Contact and a Contact Service class. Additionally, ContactTest and ContactServiceTest classes are included to verify correct operation of the production class files. Each class file with specific requirements is outlined below.

### Contact Class Requirements

- The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.

- The contact object shall have a required `firstName` String field that cannot be longer than 10 characters. The `firstName` field shall not be null.

- The contact object shall have a required `lastName` String field that cannot be longer than 10 characters. The `lastName` field shall not be null.

- The contact object shall have a required `phone` String field that must be exactly 10 digits. The `phone` field shall not be null.

- The contact object shall have a required `address` field that must be no longer than 30 characters. The `address` field shall not be null.

### Contact Test Class Requirements

- The test class shall test that the contact object has a unique contact ID of type string, that is no longer than 10 characters, not null, and not updatable.

- The test class shall test that the contact object shall have a required `firstName` String field, no longer than 10 characters. The `firstName` field shall not be null.

- The test class shall test that the contact object shall have a required `lastName` String field, no longer than 10 characters. The `lastName` field shall not be null.

- The test class shall test that the contact object shall have a required `phone` String field that must be exactly 10 digits. The `phone` field shall not be null.

- The test class shall test that the contact object shall have a required `address` field that must be no longer than 30 characters. The `address` field shall not be null.


### Contact Service Requirements

- The contact service shall be able to add contacts with a unique ID.

- The contact service shall be able to delete contacts per contact ID.

- The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
  - `firstName`
  - `lastName`
  - `Number`
  - `Address`
 
### Contact Service Test Requirements

- The contact service test class shall verify the ability to add contacts with a unique ID.

- The contact service test class shall verify the ability to delete contacts per contact ID.

- The contact service test class shall verify that ability to update contact fields per contact ID. Test shall verify that the following fields are updatable:
  - `firstName`
  - `lastName`
  - `Number`
  - `Address`

## Questions and Answers

### How can I be sure that my code, program, or software is functional and secure?

To ensure that a code base, program, or software is functional and secure, consider the following practices:

- **Unit Testing**: Write comprehensive unit tests to verify the functionality of individual components.

- **Integration Testing**: Perform integration tests so that different parts of your code work together as expected.

- **Security Audits**: Conduct security audits or code reviews to identify and address potential vulnerabilities. This may involve seeking outside sources to uncover blind spots in your authorship.

- **Input Validation**: Always validate user input to prevent malicious inputs or unexpected behavior.

- **Authentication and Authorization**: Implement proper authentication and authorization mechanisms to control access to sensitive data and functions. Role-Based Access Control [RBAC] is one way to implement such a measure.

- **Data Encryption**: Use encryption algorithms when applicable to protect sensitive data, especially when it's stored or transmitted.

- **Regular Updates**: Keep your software up-to-date with security patches and updates.

### How do I interpret user needs and incorporate them into a program?

Interpreting user needs entails effective communication and a clear understanding of the project's requirements. Some basic steps are included below:

1. **Gather Requirements**: Engage with users or shareholders to collect detailed requirements. Ask questions early and often along the way.

2. **Create User Stories or Use Cases**: Write user stories or use cases that outline specific scenarios or tasks that the program should address.

3. **Prioritize Requirements**: Identify critical and non-critical features to focus development efforts. Some features may need to be scheduled for future releases.

4. **Design and Prototyping**: Create design mockups or prototypes to visualize the user interface and flow. Get feedback from shareholders and users.

5. **Iterative Development**: Break the development process into manageable iterations. Regularly demo and gather feedback from shareholders and users.

6. **Continuous Communication**: Maintain open channels of communication with users to address questions, concerns, and changing requirements. Avoid scope creep like the plague.

7. **User Acceptance Testing (UAT)**: Conduct UAT with actual users to make sure that the software meets their needs and expectations.

8. **Feedback Loop**: Incorporate feedback into the development process to refine and improve the program. 

### How do I approach designing software?

Designing software involves careful planning and consideration of various aspects. Here's an approach to software design:

1. **Gather/Understand Requirements**: Gain a deep understanding of the project's requirements and objectives. Begin compiling functional and non-functional project requirements.

2. **Design the Architecture**: Choose an appropriate architectural pattern (e.g., MVC, Microservices, REST, SOAP) based on the project's complexity and scalability needs.

3. **Design Components**: Break down the system into smaller components or modules, each one being responsible for specific functionalities.

4. **Design the Database**: Determine the data model and relationships between different entities. Choose an appropriate database technology to handle construction and maintenance needs.

5. **Design the User Interface (UI)**: Create wireframes or mockups to visualize the user interface and user experience.

6. **Organize the Code**: Follow coding best practices, such as clean code principles and design patterns, to ensure maintainability and readability. Code should be self-documenting. Avoid unnecessary comments.

7. **Implement Error Handling and Logging**: Implement robust error handling and logging mechanisms to provide meaningful feedback in case of failures. Future you will be grateful that past you did this.

8. **Expand Scalability and Performance**: Consider the scalability requirements and design the system to handle potential growth in user base or data volume.

9. **Cement Security Measures**: Incorporate security measures like authentication, authorization, encryption, and input validation and sanitaization.

10. **Employ the Testing Strategy**: Plan for comprehensive testing, including unit tests, integration tests, and user acceptance tests.

11. **Document, Document, Document**: Provide clear and comprehensive documentation for code, APIs, and system architecture.

12. **Provide/Receive Feedback, Post-Iteration**: Seek feedback from team members and shareholders, and be willing to iterate on the design based on insights gained.

Remember that software design is an iterative process, and flexibility is key. Continuously review and refine the design as you progress through the development lifecycle.
