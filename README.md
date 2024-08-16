
# Rice Mill CRM Application

The **Rice Mill CRM Application** is a comprehensive solution designed to streamline and simplify operations in a wholesale rice mill. This application leverages Salesforce's powerful CRM capabilities to enhance customer experiences, optimize store operations, and improve overall efficiency in the rice mill factory.

## Features and Functionality

- **Reporting and Dashboards**: 
  - Generate detailed reports and analytics on daily rice production, sales, total income, and customer purchases.
  - View easily understandable data to assist owners in resource allocation and planning for future development.

- **Rollup Summary Fields**:
  - Summarizes data from child objects to parent objects in a master-detail relationship.
  - Examples: Display the total value of rice supplied from rice details on a related supplier using COUNT, SUM, MIN, and MAX functions.

- **Cross-Object Formula Fields**:
  - Reference fields from another object to calculate and display values.
  - Example: Calculate the total amount to be paid by multiplying the number of rice units by the price per kilogram.

- **Validation Rules**:
  - Ensure data integrity by applying validation rules, including error messages when invalid data is entered.
  - Example: An `ISBLANK` formula is used to validate fields, ensuring that mandatory fields are not left blank.

- **Permission Sets and Roles**:
  - Set up Organization-Wide Defaults (OWD) to restrict data access based on roles.
  - Roles include Owner, Employer, and Worker, with varying levels of access to records. 
  - Example: The Owner can view all records, the Employer can view Worker records, and Workers have limited access.

## Pre-requisites

- **Salesforce Developer Account**: A Salesforce Developer account is required to build and deploy this application.
- **Knowledge of Salesforce Admin Concepts**: Understanding Salesforce admin concepts like objects, fields, validation rules, and permissions is essential.
- **Two Web Browsers Installed**: Ensure you have at least two web browsers installed on your machine for testing and development.
- **Good Internet Connectivity**: A stable internet connection is necessary for working with Salesforce and deploying the application.

## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/snehalathaR/A-CRM-APPLICATION-FOR-WHOLESALE-RICE-MILL.git
    ```
2. **Setup Salesforce Environment**:
    - Log in to your Salesforce Developer account.
    - Create custom objects, fields, and relationships as per the application's data model.
    - Implement the rollup summary fields, cross-object formula fields, and validation rules.
    - Configure permission sets and roles according to the provided requirements.
3. **Deploy and Test**:
    - Deploy the application to your Salesforce environment.
    - Test the application features including reporting, dashboards, and data access controls.

