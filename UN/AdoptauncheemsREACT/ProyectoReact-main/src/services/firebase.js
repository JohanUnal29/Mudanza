import { initializeApp } from "firebase/app";
import {getFirestore}  from "firebase/firestore";

// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyAxcFeECvEEmdbFzDQZv1dkl6WQ64xTQdw",
  authDomain: "dasein-c86a9.firebaseapp.com",
  projectId: "dasein-c86a9",
  storageBucket: "dasein-c86a9.appspot.com",
  messagingSenderId: "1016803893952",
  appId: "1:1016803893952:web:c2ca9bb78a473625a64325",
  measurementId: "G-5J78HEHQ84"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

export const db = getFirestore(app);