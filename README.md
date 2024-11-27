# Kotlin Code Challenges

A repository of challenges solutions implemented in Kotlin, organized by challenge categories and problem names.

---

## 📂 Repository Structure

The solutions are organized as follows:

```plaintext
├── challenge/
│   ├── name/
│       ├── README.md    # Problem description and details
│       ├── solution.kt  # Kotlin solution to the problem
```
Each challenge folder contains:
- A `README.md` file with the problem description and link to challenge.
- A `solution.kt` file with the Kotlin implementation.

---

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/thyagomakiyama/kotlin-code-challenges.git
   ```
2.	Navigate to the project folder.
3.	Run all test suit using Gradle:
 
    ```bash
    ./gradlew test
    ```
4.  Run specific test suit using Gradle:
 
    ```bash
    ./gradlew test --tests "package_name.*"
    ```