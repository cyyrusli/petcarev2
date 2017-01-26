package com.example.cyrusli.petcarev2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cyrusli on 17/9/16.
 */
public class pomsky extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.doginfo, container, false);


        tv = (TextView) v.findViewById(R.id.info);
        loadText();


        return v;
    }
    private void loadText() {
        String info = new String("A Pomsky is a cross between a Pomeranian and a Siberian Husky. A crossing usually consists of a female Husky and a male Pomeranian. This is to avoid any complications that may occur if the smaller Pomeranian were to carry puppies sired by the much larger Siberian Husky male.\n" +
                "Pomskies are highly intelligent and respond well to reward based training methods. However, they can sometimes inherit the Pomeranian’s stubbornness and should therefore be handled with calm and assertive leadership. Failure to do so can result in “small dog syndrome” and other behavioral problems.\n" +
                "\n" +
                "Like their physical characteristics, the Pomsky’s temperament can sometimes be hard to predict, and will depend on each puppy’s individual genetic makeup.\n" +
                "\n" +
                "More often than not, Pomskies inherit the desirable traits from both Siberian Huskies and Pomeranians. That is to say that they are often highly intelligent, loving, playful and self-assured. Traits that both the Siberian Husky and the Pomeranian possess.\n" +
                "\n" +
                "Like Pomeranians, Pomskies are highly protective of their owners and can make great guard dogs. They will often attempt to take on any adversary that they view as a threat to their family despite their small size.\n" +
                "\n" +
                "Unlike Huskies, Pomeranians can sometimes be skittish around young children and some Pomsky puppies can display this tendency.\n" +
                "\n" +
                "Vital Stats:\n" +
                "Dog Breed Group: Hybrid\n" +
                "Weight: 20-30 pounds\n" +
                "\n" +
                "Health:\n" +
                "Pomeranians often suffer from dental issues resulting from a buildup of plaque. Pomskies too can suffer from similar dental conditions and should be taken for regular dental checkups.\n" +
                "\n" +
                "Feeding:\n" + "Recommended daily amount: 3 to 4 cups of high-quality dry food a day, divided into two meals.\n" +
                "\n" +
                "NOTE: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "Pomskies usually possess a great deal of energy and are extremely playful. Therefore they should be provided with a high quality variety of dry kibble that can supplement all their nutritional needs.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}