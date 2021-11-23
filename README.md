# **[DataBinding](https://developer.android.com/topic/libraries/data-binding)** 
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

Layouts are often defined in activities with code that calls UI framework methods. For example, the code below calls findViewById() to find a TextView widget and bind it to the userName property of the viewModel variable:
```java
findViewById<TextView>(R.id.sample_text).apply {
    text = viewModel.userName
}
```

Layouts are called with the databindiing:
```java
sample_text.text =  viewModel.userName
```

## How to Set Up
