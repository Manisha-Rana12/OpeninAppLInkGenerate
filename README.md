# OpenInApp Web UI Automation

This project automates the end-to-end (E2E) functional testing of the OpenInApp dashboard using Selenium WebDriver. The testing includes accessing the OpenInApp dashboard via a mobile browser, generating four distinct resource links using the TopSecret Link feature, sharing these links in an Instagram bio, and verifying access to the corresponding resources.

## Table of Contents

- [Project Structure](#project-structure)
- [Pre-requisites](#pre-requisites)
- [Setup and Execution](#setup-and-execution)
- [Test Scenarios](#test-scenarios)
- [Docker Image](#docker-image)
- [Test Results](#test-results)
- [Contact](#contact)

## Project Structure

<img width="450" alt="image" src="https://github.com/user-attachments/assets/9d41242f-89f4-420f-9ba5-1d3c5fca9b9f">


## Pre-requisites
- Java 8+: Ensure you have Java installed.
- Maven: This project uses Maven for managing dependencies.
- Selenium WebDriver: Integrated with the project.

## Setup and Execution
1. Clone the Repository:
   ```
   git clone https://github.com/username/OpenInAppAutomation.git
   cd OpenInAppLinkGenerate

2. Update Configuration:

- Modify the config.properties file in the src/test/resources/ directory with your credentials and URLs:
  - userEmail, password for OpenInApp login
  - instaUrl, instausername, instapassword for Instagram login

## Running Tests:
  ```
   mvn clean test
   ```

# Test Scenarios
1. Login to OpenInApp Dashboard
- **Test:** Automates the login process to the OpenInApp dashboard using Google login.
2. Generate TopSecret Links
- **Test:** Generates four distinct TopSecret links with unique titles and stores them.
3. Login to Instagram
- **Test:** Logs into Instagram and navigates to the profile section.
4. Add Links to Instagram Bio
- **Test:** Adds the generated links to the Instagram bio and saves the profile.
