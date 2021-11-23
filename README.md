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
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text = viewModel.userName
        
```

### Kotlin Android Extentions VS  Databinding
**[Kotlin Android Extentions is not recommended](https://developers-jp.googleblog.com/2020/11/the-future-of-kotlin-android-extensions.html)** 

### Databinding VS  View Binding
**[Databinding is not recommended](https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7)** 

View binding is a feature that allows you to more easily write code that interacts with views. 


## How to Set Up
build.app(Module)
```gradle
android {
    buildFeatures{
        dataBinding = true
        viewBinding = true
    }
    dataBinding{
        enabled=true
    }

}

```
