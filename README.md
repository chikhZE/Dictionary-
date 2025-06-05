# 📘 Word Explorer App

**Word Explorer** is a simple Android app built with Kotlin that lets users enter a word and explore its meaning, pronunciation, and pronunciation audio. It's perfect for learners who want a quick reference to English words and their correct pronunciation.

---

## ✨ Features

- 🔎 **Word Search** – Type in any English word.
- 📖 **Definition Viewer** – View the full definition of the word.
- 🔊 **Audio Pronunciation** – Tap a button to hear how the word is pronounced.
- 🗣️ **Text Pronunciation** – See the phonetic spelling of the word.

---

## 🚀 How It Works

1. The user enters a word in the main screen.
2. The app navigates to a new activity.
3. The new activity displays:
   - The word itself.
   - Its phonetic (IPA) pronunciation.
   - A "Play" button to hear the pronunciation.
   - Its definition.

---

## 🛠️ Tech Stack

- **Kotlin**
- **Android Studio**
- **Jetpack Components**
- (Optional) **Retrofit / Volley** – If you're using an API like [DictionaryAPI](https://dictionaryapi.dev)
- **MediaPlayer** – For playing audio files

---

## 📸 Screenshots 



![image](https://github.com/user-attachments/assets/180e57c7-a8ea-404d-8ccc-5501c39d8171)

![image](https://github.com/user-attachments/assets/343cbbc0-e26a-4f77-aa8e-21744aa33da5)



---

## 🔧 Setup Instructions

1. Clone the repository:
   ```bash
   git clone [https://github.com/chikhZE/dic.git](https://github.com/chikhZE/Dictionary-.git)
   ```
2. Open the project in Android Studio.
3. Add internet permission to `AndroidManifest.xml`:
   ```xml
   <uses-permission android:name="android.permission.INTERNET"/>
   ```
4. Run the app on an emulator or physical device.

---

## 📚 API Reference

This app uses the [Free Dictionary API](https://dictionaryapi.dev/) (or another you might be using) to fetch:
- Definitions
- Pronunciation text
- Audio URL

---

## 🙋‍♂️ Author

Created by [@chikhZE](https://github.com/chikhZE) – Web & Android Developer

---


## 📄 License

This project is open-source. You can use it freely or contribute.
