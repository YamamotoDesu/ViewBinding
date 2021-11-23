# **[Migrating the deprecated Kotlin Android Extensions compiler plugin](https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7)** 
## View Binding(recommended) 
View binding is a feature that allows you to more easily write code that interacts with views. 
```java 
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "Hello Yamamoto"
    }
```

## FindViewById(not recommended) 
> kotlinx.android.synthetic is no longer a recommended practice. Removing in favour of explicit findViewById 

Layouts are often defined in activities with code that calls UI framework methods. For example, the code below calls findViewById() to find a TextView widget and bind it to the userName property of the viewModel variable:
```java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val myTextView = findViewById(R.id.textView) as TextView
        binding.textView.text = "Hello Yamamoto"
```

## Data Binding(not recommended) 
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
Layouts are called with the databindiing:
```java
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.textView.text = "Hello Yamamoto"
        
```

### How to Set Up View Binding
build.app(Module)
```gradle
android {
    buildFeatures {
        viewBinding true
    }
}

```

### How to Set Up Data Binding
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


### The Difference Between Databinding and View Binding is only the initialization 
```java 
//DataBinding
binding= DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
//ViewBinding
binding= ActivityMainBinding.inflate(layoutInflater)
```
