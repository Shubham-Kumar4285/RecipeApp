# Recipe App

## Overview

The **Recipe App** is a simple Android application built using **Jetpack Compose**. It retrieves recipe data from an external API and dynamically updates the UI for browsing. The app is designed using the **MVVM architecture** for better separation of concerns and maintainability. It also incorporates **Coil** for efficient image loading, **Retrofit** for API calls, and **Compose Navigation** for handling navigation between screens.

---

## Features

- **Recipe Browsing:**  
  Browse through a collection of recipes fetched from an external API with detailed information like ingredients, cooking time, and more.

- **API Integration:**  
  The app communicates with an external recipe API via **Retrofit** to fetch the data and populate the UI.

- **MVVM Architecture:**  
  Implements **Model-View-ViewModel (MVVM)** architecture, ensuring a clean separation between the UI, business logic, and data.

- **Image Loading with Coil:**  
  Recipes contain images which are efficiently loaded with **Coil**, an image loading library for Android.

- **Compose Navigation:**  
  Uses **Compose Navigation** to enable smooth transitions between the main recipe list, recipe details, and other potential screens.

- **Responsive UI:**  
  The app adapts to different screen sizes and orientations, providing a consistent and responsive UI.

- **Offline Support (Future):**  
  Plans to implement offline functionality, allowing users to view previously loaded recipes when not connected to the internet.

---
## Screenshots


---

## Technologies Used

- **Jetpack Compose:**  
  A modern UI toolkit for building native UIs with a declarative approach in Kotlin.

- **MVVM Architecture:**  
  **Model-View-ViewModel** structure for organizing the app's business logic and UI components in a scalable way.

- **Retrofit:**  
  A type-safe HTTP client used to make network requests and handle API responses.

- **Coil:**  
  A lightweight image loading library for Android, used to efficiently load and cache images from the API.

- **Compose Navigation:**  
  Provides a simple and flexible way to navigate between different UI components in Jetpack Compose.

- **Kotlin:**  
  The primary programming language used for developing Android applications.

---

## How to Run the App

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Shubham-Kumar4285/RecipeApp.git
