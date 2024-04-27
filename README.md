Instructions:

1) Clone this repository:
git clone https://github.com/<your-github-username>/backend-training-center.git


2) Navigate to the project directory:
cd backend-Traini8_imranBhat

3) Install dependencies (using Maven):
mvn clean install

4) Configure database connection details in the .env file:
Create a file named .env in the project root directory.
MONGODB_URI=mongodb+srv://imran00852:evcvxBmB2MAYhlgG@cluster0.2qh1w5d.mongodb.net/mydatabase?retryWrites=true&w=majority&appName=Cluster0

5) Start the application
mvn spring-boot:run

The application will start on port 8080 (default) by default. You can access the APIs once the server is running.

#API_Documentation
1. Create new Training Center (POST /api/training-centers/new)
   Request Body (JSON):

JSON
{
"centerName": "Trani8 Training Center",
"centerCode": "TC1234567890",
"address": {
"detailedAddress": "123 Main Street",
"city": "Anytown",
"state": "CA",
"pincode": "12345"
},
"studentCapacity": 100,
"coursesOffered": ["Java", "Python", "Data Science"],
"contactEmail": "training@trani8.com",
"contactPhone": "+1234567890"
}

Response:

On success, the newly created training center information will be returned in JSON format.
On failure, an error message will be provided indicating the validation errors or any other issues encountered.

Validation:

centerName: Required, less than 40 characters.
centerCode: Required, exactly 12 character alphanumeric.
address: All fields within the address object are required.
studentCapacity: Required, positive integer.
coursesOffered: Optional, list of strings.
contactEmail: Optional, if present, must be a valid email address.
contactPhone: Optional, if present, must be a valid phone number.


**2. Get List of Training Centers (GET /api/training-centers)

Response:

An empty list will be returned if no training centers exist.
Otherwise, a list of training center objects will be returned in JSON format.
