package com.example.cyrusli.petcarev2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cyrusli on 18/9/16.
 */
public class maltese extends Fragment {

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
        String info = new String("Exercise Needs: 3/5\n" +
                "This elegant toy dog breed is famed for the silky white hair covering his body. Straight and thick, the coat falls all the way to the floor. Many years ago, Maltese came in many colors, but these days they are always white. When a properly built Maltese moves, he seems to float beneath his cloud of white hair. Because he doesn't have an undercoat, the Maltese sheds little, and many people consider the breed to be hypoallergenic.\n" +
                "\n" +
                "But the Maltese is more than his coat. Completing the picture is a slightly rounded skull, black nose, drop ears, dark, alert eyes, short, straight legs, and a graceful tail. He's a sweet, intelligent dog who is devoted to his people. And as one of the smallest of the toy breeds, he's well suited to apartment or condo living. Wherever he lives, the Maltese is responsive to his environment and makes an effective watchdog.\n" +
                "\n" +
                "Although they look delicate and aristocratic, Maltese can have a lot of energy. They learn quickly if rewarded for their efforts. Because they have a long history as companion dogs, Maltese require a lot of human attention and suffer from separation anxiety. If left alone for hours each day, they can bark and become destructive.\n" +
                "\n" +
                "No breed is perfect, and Maltese sometimes are intolerant of small children or other dogs, especially if they have been overly pampered by their people. If this occurs, they can become very protective, barking and even biting if animals or people are perceived as a threat to their relationship with their beloved human family.\n" +
                "\n" +
                "Even tolerant Maltese are not a good choice for families with small children, however, because they are so small and can be easily injured. Like all dogs, they must be taught their place in your home, and require proper socialization and basic obedience training.\n" +
                "\n" +
                "Vital Needs:\n" +
                "Breed Group: Companion Dogs\n" +
                "Height: 8 inches to 10 inches tall at the shoulder\n" +
                "Weight: Up to 7 pounds\n" +
                "Life Span: 12 to 15 years\n" +
                "\n" +
                "Health:\n" +
                "Patellar luxation: The patella is the kneecap. Luxation means dislocation of an anatomical part (as a bone at a joint). Patellar luxation is when the knee joint (often of a hind leg) slides in and out of place, causing pain. This can be crippling, but many dogs lead relatively normal lives with this condition.\n" +
                "\n" +
                "Portosystemic liver shunt: This renal disorder occurs when an abnormal vessel causes blood to bypass the liver and therefore not be cleansed.\n" +
                "\n" +
                "Progressive Retinal Atrophy (PRA): A degenerative eye disorder. Blindness caused by PRA is a slow process resulting from the loss of photoreceptors at the back of the eye. PRA is detectable years before the dog shows any signs of blindness. A reputable breeder will have dogs' eyes certified annually by a veterinary ophthalmologist.\n" +
                "\n" +
                "Hypoglycemia: This malady is caused by low blood sugar. Some of the signs may include weakness, confusion, a wobbly gait, and seizure-like episodes. If your dog is susceptible to this, talk to your vet about prevention and treatment options.\n" +
                "\n" +
                "White Dog Shaker Syndrome: This disorder that primarily affects white dogs. Signs of the condition are tremors over the entire body, lack of coordination, and rapid eye movements. Episodes usually start when the dog is six months to three years old and is stressed or overly excited. This condition isn't painful and doesn't affect the dog's personality. If you suspect your Maltese has White Dog Shaker Syndrome, talk to your vet about treatment options.\n" +
                "\n" +
                "Collapsed trachea: Some dogs are prone to this condition, in which the trachea, which carries air to the lungs, tends to collapse easily. The most common sign of a collapsed trachea is a chronic, dry, harsh cough that many describe as being similar to a \"goose honk.\" Collapsed trachea can be treated medically or surgically.\n" +
                "\n" +
                "Reverse sneezing: Sometimes confused with a collapsed trachea, this is a far less serious condition and lasts only a few minutes. Reverse sneezing primarily occurs when your dog is excited or tries to eat or drink too fast. It also can occur when there are pollens or other irritants in the air. Secretions from the dog's nose drop onto their soft palate, causing it to close over the windpipe in an automatic reaction. This can be very frightening to your Maltese, but as soon as he calms down, the reverse sneezing stops. Gently stroke his throat to help him relax.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 1/4 to 1/2 cup of high-quality dry food a day, divided into two meals.\n" +
                "\n" +
                "Keep your Maltese from getting fat by measuring his food and feeding him twice a day instead of leaving food out all the time. You can tell if he's getting overweight by giving him the hands-on test.\n" +
                "\n" +
                "Place your hands on his body, thumbs along the spine and fingers spread out over his sides. If you can feel his ribs, he's in good condition, but if they're buried beneath a layer of fat, it's time to put him on a diet and cut back on the amount of treats you're giving.\n" +
                "\n" +
                "Some Maltese have delicate digestive systems and may be picky eaters. Eating problems can occur if your Maltese has teeth or gum problems as well. If your Maltese is showing discomfort when eating or after eating, take him to the vet for a checkup.\n" +
                "\n" +
                "Note: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}