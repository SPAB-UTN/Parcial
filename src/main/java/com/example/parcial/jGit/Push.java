package com.example.parcial.jGit;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.RemoteAddCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.example.parcial.jGit.Ramas.Rama;

public class Push {
    public static void main(String[] args) throws IOException, GitAPIException, URISyntaxException {

        try{
            String repoPath = "https://github.com/SPAB-UTN/Parcial.git";
            String localPath = "D:\\Documentos\\UTN - Programación\\3° Semestre\\parcial";
            Repository localRepo = new FileRepository(localPath);
            int i=0;

            try (Git git = Git.init().setDirectory(new File(localPath)).call()){

                AddCommand add = git.add();
                //Add all
                add.addFilepattern(".").call();
                //Commit
                git.commit().setMessage("Added alumno").call();

                // Repositorio remoto
                RemoteAddCommand remoteAddCommand = git.remoteAdd();
                remoteAddCommand.setName("origin");
                remoteAddCommand.setUri(new URIish(repoPath));
                remoteAddCommand.call();

                // Push
                PushCommand push = git.push();
                push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("SPAB-UTN", "cursadoutn1"));
                push.call();

                //RealizaLaCreacionDeLasRamas

                Rama();


            }



        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
