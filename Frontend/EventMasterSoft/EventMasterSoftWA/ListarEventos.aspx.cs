﻿using EventMasterSoftWA.ServicioWS;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace EventMasterSoft
{
    /* Colocar sus datos personales
     * ------------------------------------------------
     * Nombre Completo: Reynaldo Alonso Mamani Yufra
     * Codigo PUCP: 20221386
     * ------------------------------------------------
     */
    public partial class ListarEventos : System.Web.UI.Page
    {
        private EventoWSClient daoEvento = new EventoWSClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            gvEventos.DataSource = daoEvento.listarEventosPorNombre(txtNombre.Text);
            gvEventos.DataBind();
        }

        protected void lbRegistrar_Click(object sender, EventArgs e)
        {
            Response.Redirect("RegistrarEvento.aspx");
        }

        protected void lbVisualizar_Click(object sender, EventArgs e)
        {
            int idEvento = Int32.Parse(((LinkButton)sender).CommandArgument);
            Response.Redirect("RegistrarEvento.aspx?accion=ver&idEvento=" + idEvento);
        }
    }
}