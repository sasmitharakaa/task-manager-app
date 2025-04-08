# task-manager-app
a Task Manager web application using Angular for the front end and Spring Boot for the back end

# 📝 Task Management System

Welcome to the Full Stack Task Management System! This project demonstrates the development of a comprehensive and role-based task management application using the following technologies:

- 🌱 **Backend**: Spring Boot  
- 🧩 **Frontend**: Angular + Angular Material  
- 🛢️ **Database**: MySQL


## 🚀 Features

### 👑 Admin Role
- Create, view, update, and delete tasks.
- Assign tasks to employees using their unique user ID.
- Add and view comments on each task for effective communication.
- Search tasks by title to quickly locate specific items.

### 👨‍💼 Employee Role
- View tasks assigned to them by their user ID.
- Update task statuses (e.g., pending, in-progress, completed).
- Comment on tasks to provide status updates and collaborate with Admins.

## 🛠️ Tech Stack

| Technology        | Description              |
|-------------------|--------------------------|
| **Spring Boot**   | Backend REST API         |
| **Angular**       | Frontend SPA Framework   |
| **Angular Material** | UI Components        |
| **MySQL**         | Relational Database      |

## 📂 Project Structure Overview
task-management-system/ 
├── backend/ # Spring Boot backend 
│ └── src/main/java/... # APIs, Services, Entities 
├── frontend/ # Angular frontend 
│ └── src/app/... # Components, Routing, Services 
└── database/ # SQL schema and seed data


## ⚙️ Getting Started

### 🔧 Backend (Spring Boot)

1. Go to the `backend` folder.
2. Set up your `application.properties` file with MySQL credentials.
3. Run the application:
   ```bash
   mvn spring-boot:run
💻 Frontend (Angular)
Navigate to the frontend folder.

# Install dependencies:
npm install

# Start the app:
ng serve

# Open in browser:
http://localhost:4200

# Test Credentials
Role	  -     Admin	 | Employee
Username  -	    admin01	  | emp01
Password   -   admin123  | emp123
         
	 	       






