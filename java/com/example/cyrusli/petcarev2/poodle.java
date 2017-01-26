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
public class poodle extends Fragment{
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
        String info = new String("Exercise Needs: 4/5\n" +
                "Even the elaborate coat styling that the breed's known for once had a practical purpose: trimmed areas lightened the weight of the dog's coat and wouldn't snag on underwater debris, while long hair around the joints and vital organs protected the dog from the cold water.\n" +
                "\n" +
                "There are three sizes of Poodle, all considered part of the same breed: going from smallest to largest, these are the Toy, the Miniature, and the Standard. The Standard is probably the oldest of the three varieties, and some still carry on the Poodle tradition of working as a water retriever.\n" +
                "\n" +
                "No matter the size, Poodles are renowned for a playful but dignified personality and keen intelligence. When it comes to training, this is an \"A\" student, and the Poodle excels at performance sports such as obedience, agility, and hunt tests.\n" +
                "\n" +
                "Despite his regal air, the Poodle is no snob. These are people-friendly dogs who want to stay close to their families — they get lonely when left by themselves for long periods — and are always up for a good game.\n" +
                "\n" +
                "Vital Stats:\n" +
                "Breed Group: Companion Dogs\n" +
                "Toy Poodle: 10 inches tall, and weighs about six to nine pounds.\n" +
                "Miniature Poodle: 11 to 15 inches tall and weighs 15 to 17 pounds\n" +
                "Standard Poodle: 15 inches and taller (usually 22 inches); males weigh 45 to 70 pounds and females weigh 45 to 60 pounds\n" +
                "\n" +
                "Life Span: 12-15 or more years\n" +
                "\n" +
                "Health:\n" +
                "Addison's Disease: Also known as hypoadrenocorticism, this extremely serious condition is caused by an insufficient production of adrenal hormones by the adrenal gland. Most dogs with Addison's disease vomit, have a poor appetite, and lethargy. Because these signs are vague and can be mistaken for other conditions, it's easy to miss this disease as a diagnosis until it reaches more advanced stages. More severe signs occur when a dog is stressed or when potassium levels get high enough to interfere with heart function, causing severe shock and death. If Addison's is suspected, your vet may perform a series of tests to confirm the diagnosis.\n" +
                "\n" +
                "Gastric Dilatation-Volvulus: Commonly called bloat, this is a life-threatening condition that affects large, deep-chested dogs like Poodles, especially if they are fed one large meal a day, eat rapidly, drink large volumes of water after eating, and exercise vigorously after eating. Bloat occurs when the stomach is distended with gas or air and then twists. The dog is unable to belch or vomit to rid itself of the excess air in its stomach, and the normal return of blood to the heart is impeded. Blood pressure drops and the dog goes into shock. Without immediate medical attention, the dog can die. Suspect bloat if your dog has a distended abdomen, is salivating excessively and retching without throwing up. He also may be restless, depressed, lethargic, and weak with a rapid heart rate. It's important to get your dog to the vet as soon as possible.\n" +
                "\n" +
                "Cushings Disease (Hyperadrenocorticism): This condition occurs when the body produces too much cortisol. It can be due to an imbalance of the pituitary or adrenal gland, or it can occur when a dog has too much cortisol resulting from other conditions. Common signs are excessive drinking and urination. If your Poodle exhibits these two symptoms, take it to the veterinarian. There are treatments to help with this disease, including surgery and medication.\n" +
                "\n" +
                "Epilepsy: A common cause of seizures in all varieties of Poodles is idiopathic epilepsy. It often is inherited and can cause mild or severe seizures. Seizures may be exhibited by unusual behavior, such as running frantically as if being chased, staggering, or hiding. Seizures are frightening to watch, but the long-term prognosis for dogs with idiopathic epilepsy is generally very good. It's important to remember that seizures can be caused by many other things than idiopathic epilepsy, such as metabolic disorders, infectious diseases that affect the brain, tumors, exposure to poisons, severe head injuries, and more. Therefore, if your Poodle has seizures, it's important to take him to the vet right away for a checkup.\n" +
                "\n" +
                "Hip Dysplasia: When the hip socket is poorly formed or the ligaments are loose enough to allow the ball of the thigh bone (femur) to slide part of the way out of the hip socket, it's called dysplastic. Canine hip dysplasia is inherited, with environmental factors sometimes playing a large part in its development. Over time, there is degeneration of the joint that can cause arthritis and pain, even lameness. Excess weight, excessive or prolonged exercise before maturity, a fast growth rate, and high-calorie or supplemented diets can contribute to the development of canine hip dysplasia. Veterinary care includes nutritional supplements, medication and, in some cases, surgery.\n" +
                "\n" +
                "Hypothyroidism: Hypothyroidism is caused by is an under active thyroid gland. It's thought to be responsible for conditions such as epilepsy, hair loss, obesity, lethargy, hyperpigmentation, pyoderma and other skin conditions.\n" +
                "\n" +
                "Legg-Perthes Disease: This is another disease involving the hip joint. Many toy breeds are prone to this condition. When your Poodle has Legg-perthes, the blood supply to the head of the femur (the large rear leg bone) is decreased, and the head of the femur that connects to the pelvis begins to disintegrate. Usually, the first signs of Legg-Perthes, limping and atrophy of the leg muscle, occur when puppies are 4 to 6 months old. The condition can be corrected with surgery to cut off the diseased femur so that it isn't attached to the pelvis any longer. The scar tissue that results from the surgery creates a false joint and the puppy is usually pain free.\n" +
                "\n" +
                "Patellar Luxation: The patella is the kneecap. Luxation means dislocation of an anatomical part (as a bone at a joint). Patellar luxation is when the knee joint (often of a hind leg) slides in and out of place, causing pain. This can be crippling, but many dogs lead relatively normal lives with this condition.\n" +
                "Progressive Retinal Atrophy (PRA): PRA is a family of eye diseases that involves the gradual deterioration of the retina. Early in the disease, affected dogs become night-blind. As the disease progresses, they lose sight during the day. Many affected dogs adapt to their limited or loss of vision very well, as long as the surroundings remain the same.\n" +
                "\n" +
                "Optic Nerve Hypoplasia: This condition is a congenital failure if development of the optic nerve. It causes blindness and abnormal pupil response in the affected eye.\n" +
                "\n" +
                "Sebaceous Adenitis (SA): SA is a serious problem in Poodles, especially Standards. It's estimated that 50 percent of all Standard Poodles are carriers, or affected. This genetic condition is difficult to diagnose and often is mistaken for hypothyroidism, allergies, or other conditions. When a dog has SA, the sebaceous glands in the skin become inflamed for unknown reasons, and are eventually destroyed. These glands typically produce sebum, a fatty secretion that aids in preventing drying of the skin. It's usually first noticed when the dog is from 1 to 5 years old. Affected dogs typically have dry, scaly skin with hair loss on top of the head, neck, and back. Severely affected dogs can have thickened skin and an unpleasant odor, along with secondary skin infections. Although the problem is primarily cosmetic, it can be uncomfortable for the dog. Your vet will perform a biopsy of the skin if SA is suspected. Treatment options vary.\n" +
                "\n" +
                "Von Willebrand's Disease: This is an inherited blood disorder that interferes with the blood's ability to clot. The main symptom is excessive bleeding after an injury or surgery. Other symptoms include nosebleeds, bleeding gums, or bleeding in the stomach or intestines. There is no cure, and a blood transfusion from the blood of normal dogs is currently the only treatment. Research is underway for new treatments, including medication. Most dogs with von Willebrand's disease can lead normal lives. A vet can test your dog for the condition. Dogs with this condition should not be bred.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: Standards, 1.5 to 3 cups of high-quality dry food a day, divided into two meals; Miniatures, 3/4 to 1 cup; Toys, 1/4 to 1/2 cup.\n" +
                "\n" +
                "Note: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "Like any breed, the poodle will pack on weight if he's overfed, which can cause joint problems and other health woes. Limit treats, keep him active, and feed in meals rather than leaving food available at all times. Although many owners of Miniature or Toy Poodles in particular give their dogs table scraps, resist those pleading eyes — you'll create a finicky eater. He'll turn up his nose at dog food, which is healthier for him.\n" +
                "\n" +
                "Keep your Poodle in good shape by measuring his food and feeding him twice a day rather than leaving food out all the time. If you're unsure whether he's overweight, give him the eye test and the hands-on test. First, look down at him. You should be able to see a waist. Then place your hands on his back, thumbs along the spine, with the fingers spread downward. You should be able to feel but not see his ribs without having to press hard. If you can't, he needs less food and more exercise.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}