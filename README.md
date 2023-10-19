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

### Contact Class Requirements

- The test class shall test that the contact object has a unique contact ID of type string, that is no longer than 10 characters, not null, and not updatable.

- The contact object shall have a required `firstName` String field that cannot be longer than 10 characters. The `firstName` field shall not be null.

- The contact object shall have a required `lastName` String field that cannot be longer than 10 characters. The `lastName` field shall not be null.

- The contact object shall have a required `phone` String field that must be exactly 10 digits. The `phone` field shall not be null.

- The contact object shall have a required `address` field that must be no longer than 30 characters. The `address` field shall not be null.


### Contact Service Requirements

- The contact service shall be able to add contacts with a unique ID.

- The contact service shall be able to delete contacts per contact ID.

- The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
  - `firstName`
  - `lastName`
  - `Number`
  - `Address`

## Questions and Answers

### How can I ensure that my code, program, or software is functional and secure?

To ensure that your code, program, or software is functional and secure, consider the following practices:

- **Unit Testing**: Write comprehensive unit tests to verify the functionality of individual components.

- **Integration Testing**: Perform integration tests to ensure that different parts of your code work together as expected.

- **Security Audits**: Conduct security audits or code reviews to identify and address potential vulnerabilities.

- **Input Validation**: Always validate user input to prevent malicious inputs or unexpected behavior.

- **Authentication and Authorization**: Implement proper authentication and authorization mechanisms to control access to sensitive data and functions.

- **Data Encryption**: Use encryption algorithms to protect sensitive data, especially when it's stored or transmitted.

- **Regular Updates**: Keep your software up-to-date with security patches and updates.

### How do I interpret user needs and incorporate them into a program?

Interpreting user needs involves effective communication and understanding of the requirements. Here's a process to incorporate user needs into a program:

1. **Gather Requirements**: Engage with users or stakeholders to collect detailed requirements. Ask questions to clarify ambiguities.

2. **Create User Stories or Use Cases**: Write user stories or use cases that outline specific scenarios or tasks the program should address.

3. **Prioritize Requirements**: Identify critical and non-critical features to focus development efforts.

4. **Design and Prototyping**: Create design mockups or prototypes to visualize the user interface and flow. Get feedback from users.

5. **Iterative Development**: Break the development process into manageable iterations. Regularly demo and gather feedback from users.

6. **Continuous Communication**: Maintain open channels of communication with users to address questions, concerns, and changing requirements.

7. **User Acceptance Testing (UAT)**: Conduct UAT with actual users to ensure the software meets their needs and expectations.

8. **Feedback Loop**: Incorporate feedback into the development process to refine and improve the program.

### How do I approach designing software?

Designing software involves careful planning and consideration of various aspects. Here's an approach to software design:

1. **Understand Requirements**: Gain a deep understanding of the project's requirements and objectives.

2. **Architecture Design**: Choose an appropriate architectural pattern (e.g., MVC, Microservices) based on the project's complexity and scalability needs.

3. **Component Design**: Break down the system into smaller components or modules, each responsible for specific functionalities.

4. **Database Design**: Determine the data model and relationships between different entities. Choose an appropriate database technology.

5. **User Interface (UI) Design**: Create wireframes or mockups to visualize the user interface and user experience.

6. **Code Organization**: Follow coding best practices, such as clean code principles and design patterns, to ensure maintainability and readability.

7. **Error Handling and Logging**: Implement robust error handling and logging mechanisms to provide meaningful feedback in case of failures.

8. **Scalability and Performance**: Consider the scalability requirements and design the system to handle potential growth in user base or data volume.

9. **Security Measures**: Incorporate security measures like authentication, authorization, encryption, and input validation.

10. **Testing Strategy**: Plan for comprehensive testing, including unit tests, integration tests, and user acceptance tests.

11. **Documentation**: Provide clear and comprehensive documentation for code, APIs, and system architecture.

12. **Feedback and Iteration**: Seek feedback from team members and stakeholders, and be willing to iterate on the design based on insights gained.

Remember that software design is an iterative process, and flexibility is key. Continuously review and refine the design as you progress through the development lifecycle.
