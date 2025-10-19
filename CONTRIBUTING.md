# Contributing to Java Repository

Thank you for your interest in contributing to this Java learning repository! This document provides guidelines and instructions for contributing.

## Table of Contents
- [Code of Conduct](#code-of-conduct)
- [How to Contribute](#how-to-contribute)
- [Getting Started](#getting-started)
- [Contribution Guidelines](#contribution-guidelines)
- [Submitting Changes](#submitting-changes)
- [Reporting Issues](#reporting-issues)
- [Style Guidelines](#style-guidelines)

---

## Code of Conduct

By participating in this project, you are expected to:
- Be respectful and inclusive
- Provide constructive feedback
- Focus on what is best for the community
- Show empathy towards other community members

---

## How to Contribute

There are many ways to contribute to this repository:

1. **Add Java code examples**: Share useful Java code snippets and examples
2. **Improve documentation**: Enhance existing notes or add new topics
3. **Fix bugs**: Find and fix errors in code examples
4. **Add exercises**: Create practice problems with solutions
5. **Share resources**: Add helpful links and references
6. **Review contributions**: Help review pull requests from other contributors

---

## Getting Started

### Prerequisites
- Git installed on your machine
- GitHub account
- Java Development Kit (JDK) installed (version 8 or higher recommended)
- A text editor or IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Fork and Clone the Repository

1. **Fork the repository**: Click the "Fork" button at the top right of the repository page

2. **Clone your fork**:
   ```bash
   git clone https://github.com/YOUR-USERNAME/Java.git
   cd Java
   ```

3. **Add upstream remote**:
   ```bash
   git remote add upstream https://github.com/Akhil-Biswas/Java.git
   ```

4. **Keep your fork updated**:
   ```bash
   git fetch upstream
   git merge upstream/main
   ```

---

## Contribution Guidelines

### What to Contribute

#### ✅ Good Contributions:
- Well-documented Java code examples
- Clear explanations of Java concepts
- Practice exercises with solutions
- Bug fixes in existing code
- Improvements to existing documentation
- Additional Java topics and notes
- Best practices and design patterns
- Real-world examples and use cases

#### ❌ Avoid:
- Plagiarized content
- Incomplete or untested code
- Code without proper comments or documentation
- Content unrelated to Java programming
- Large binary files
- Duplicate content that already exists

### File Organization

Please organize your contributions as follows:

```
Java/
├── Java-Notes.md              # Main Java notes file
├── CONTRIBUTING.md            # This file
├── README.md                  # Repository overview
├── examples/                  # (Optional) Code examples directory
│   ├── basics/
│   ├── oop/
│   ├── collections/
│   └── ...
├── exercises/                 # (Optional) Practice exercises
│   ├── beginner/
│   ├── intermediate/
│   └── advanced/
└── resources/                 # (Optional) Additional resources
```

---

## Submitting Changes

### Step-by-Step Process

1. **Create a new branch**:
   ```bash
   git checkout -b feature/your-feature-name
   ```
   or
   ```bash
   git checkout -b fix/your-bug-fix
   ```

2. **Make your changes**:
   - Write clean, well-documented code
   - Follow the style guidelines (see below)
   - Test your code thoroughly

3. **Commit your changes**:
   ```bash
   git add .
   git commit -m "Add: Brief description of your changes"
   ```

   **Commit Message Format**:
   - `Add: ...` - for new features or content
   - `Fix: ...` - for bug fixes
   - `Update: ...` - for updates to existing content
   - `Docs: ...` - for documentation changes
   - `Refactor: ...` - for code refactoring

4. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

5. **Create a Pull Request**:
   - Go to the original repository on GitHub
   - Click "New Pull Request"
   - Select your fork and branch
   - Provide a clear title and description
   - Explain what changes you made and why
   - Reference any related issues

6. **Wait for review**:
   - Address any feedback from reviewers
   - Make requested changes if necessary
   - Be patient and respectful

---

## Reporting Issues

If you find a bug or have a suggestion:

1. **Check existing issues** to avoid duplicates
2. **Create a new issue** with a clear title and description
3. **Provide details**:
   - What you expected to happen
   - What actually happened
   - Steps to reproduce (if applicable)
   - Your environment (Java version, OS, etc.)
4. **Add labels** if possible (bug, enhancement, documentation, etc.)

### Issue Template

```markdown
## Description
A clear description of the issue or suggestion

## Expected Behavior
What you expected to happen

## Actual Behavior
What actually happened

## Steps to Reproduce
1. Step one
2. Step two
3. ...

## Environment
- Java Version: [e.g., Java 17]
- Operating System: [e.g., Windows 10, Ubuntu 22.04]
- Additional context: [Any other relevant information]
```

---

## Style Guidelines

### Java Code Style

1. **Naming Conventions**:
   - Classes: `PascalCase` (e.g., `MyClass`)
   - Methods/Variables: `camelCase` (e.g., `myMethod`, `userName`)
   - Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_SIZE`, `DEFAULT_VALUE`)
   - Packages: lowercase (e.g., `com.example.project`)

2. **Indentation**:
   - Use 4 spaces for indentation (not tabs)
   - Keep lines under 100 characters when possible

3. **Braces**:
   ```java
   // Good
   if (condition) {
       // code
   }
   
   // Avoid
   if (condition)
   {
       // code
   }
   ```

4. **Comments**:
   ```java
   /**
    * Javadoc comment for classes and public methods
    * @param paramName description
    * @return description
    */
   public int myMethod(int paramName) {
       // Inline comment for explaining complex logic
       return paramName * 2;
   }
   ```

5. **Whitespace**:
   - One blank line between methods
   - One space after keywords (`if`, `for`, `while`)
   - One space around operators (`+`, `-`, `=`, etc.)

### Markdown Style

1. **Headers**: Use ATX-style headers (`#`, `##`, `###`)
2. **Code Blocks**: Use triple backticks with language specification
   ````markdown
   ```java
   public class Example {
       // code here
   }
   ```
   ````
3. **Lists**: Use consistent markers (`-` or `*` for unordered, `1.` for ordered)
4. **Links**: Use descriptive link text, not "click here"

### Documentation Style

1. **Be Clear and Concise**: Explain concepts in simple terms
2. **Provide Examples**: Include code examples for better understanding
3. **Use Proper Grammar**: Check spelling and grammar
4. **Format Code**: Use syntax highlighting for code blocks
5. **Add Comments**: Explain what the code does

---

## Code Review Process

All contributions will be reviewed before merging:

1. **Automated Checks**: Code will be checked for syntax and style
2. **Manual Review**: Maintainers will review your code and documentation
3. **Feedback**: You may be asked to make changes
4. **Approval**: Once approved, your contribution will be merged

### What Reviewers Look For:
- Code quality and correctness
- Proper documentation
- Adherence to style guidelines
- No breaking changes to existing code
- Useful and relevant content

---

## Recognition

Contributors who make significant contributions will be recognized in the repository. We appreciate all contributions, big or small!

---

## Questions?

If you have any questions about contributing, feel free to:
- Open an issue with the label "question"
- Contact the repository maintainer
- Join discussions in existing issues

---

## License

By contributing to this repository, you agree that your contributions will be licensed under the same license as the project.

---

## Thank You! 🎉

Thank you for taking the time to contribute to this Java learning repository. Your efforts help make this a valuable resource for learners worldwide!

Happy Coding! ☕
