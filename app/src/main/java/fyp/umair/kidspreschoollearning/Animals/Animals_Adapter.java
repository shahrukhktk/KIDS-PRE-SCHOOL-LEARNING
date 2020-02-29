package fyp.umair.kidspreschoollearning.Animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

import fyp.umair.kidspreschoollearning.R;

public class Animals_Adapter extends RecyclerView.Adapter<Animals_Adapter.ViewHolder_Animal>
{
    ArrayList<Animals_Model> animals_list;
    Context getAppContext;

    public Animals_Adapter(ArrayList<Animals_Model> animals_list, Context getAppContext) {
        this.animals_list = animals_list;
        this.getAppContext = getAppContext;
    }

    @Override
    public ViewHolder_Animal onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(getAppContext).inflate(R.layout.animals_custom_adapter_view, parent, false);
        return new ViewHolder_Animal(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder_Animal holder, int position) {
        Animals_Model model = animals_list.get(position);
        holder.ani_name.setText(model.getAnimalName());
        holder.ani_description.setText(model.getAnimal_Description());
        holder.ani_cardView.setCardBackgroundColor(model.getColor());
        Picasso.get().load(model.getAnimal_Image()).into(holder.ani_img);

    }

    @Override
    public int getItemCount() {
        return animals_list.size();
    }

    public class ViewHolder_Animal extends RecyclerView.ViewHolder
    {
        ImageView ani_img;
        TextView ani_name, ani_description;
        CardView ani_cardView;

        public ViewHolder_Animal(View item_view) {
            super(item_view);

            ani_name = item_view.findViewById(R.id.animal_Name_txtID);
            ani_description = item_view.findViewById(R.id.animal_Description_txtID);
            ani_img = item_view.findViewById(R.id.animal_Img_ID);
            ani_cardView = item_view.findViewById(R.id.animal_card_ID);
        }
    }
}
