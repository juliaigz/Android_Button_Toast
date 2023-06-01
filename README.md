# Android_Button_Toast
### This project is about buttons and making messages with Toast

XML 

![image](https://github.com/juliaigz/Android_Button_Toast/assets/40221707/ba89616d-fae7-4354-b714-a25a649a51cb)

BINDING 
Build Gradle: Module app
![image](https://github.com/juliaigz/Android_Button_Toast/assets/40221707/4721931a-2c95-4998-ac8c-04a96fb49871)

activity_main.xml
![image](https://github.com/juliaigz/Android_Button_Toast/assets/40221707/2c5af152-951d-46e1-b1cc-9c4d10558960)
![image](https://github.com/juliaigz/Android_Button_Toast/assets/40221707/3251ffd8-27b0-4b91-a8e7-fc2e095f15a7)

MainActivity
![image](https://github.com/juliaigz/Android_Button_Toast/assets/40221707/e01421a1-05b1-4a19-ae4b-e44506888d60)

code:

```bash
public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButtonAndroid;
    private ActivityMainBinding binding; //1 era parte del binding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); //2 da parte del binding
        setContentView(binding.getRoot());

        imageButton1 = binding.imageButton1;
        imageButton2 = binding.imageButton2;
        imageButton3 = binding.imageButton3;
        imageButton4 = binding.imageButton4;
        imageButton5 = binding.imageButton5;
        imageButton6 = binding.imageButton6;
        imageButtonAndroid = binding.imageButtonAndroid;

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            printToast("image Button 1");
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("imageButton 2");
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 3");
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 4");
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button5");
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 6");
            }
        });

        imageButtonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button Android");
            }
        });
    }

    protected void printToast(String imgName){
        Context contexto = getApplicationContext();
        CharSequence mensaje = "La imagen es : "+imgName;
        int duracion = Toast.LENGTH_SHORT;
        Toast.makeText(contexto, mensaje, duracion).show();
    }
}
```
